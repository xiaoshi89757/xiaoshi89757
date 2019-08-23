/*
package wifi;

package cn.wch.ch34xuartdriver;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences;
import android.hardware.usb.UsbManager;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;

public class MainActivity
        extends Activity
{
    private static final String ACTION_USB_PERMISSION = "cn.wch.wchusbdriver.USB_PERMISSION";
    private static final String PATH = Environment.getExternalStorageDirectory().getPath() + "/doit.txt";
    public static final String TAG = "cn.wch.wchusbdriver";
    public boolean READ_ENABLE = false;
    public String act_string;
    private MyAdapter adapter;
    public int baudRate;
    public byte baudRate_byte;
    private Spinner baudSpinner;
    private Button configButton;
    public byte count;
    private Button cunButton;
    public byte dataBit;
    private Spinner dataSpinner;
    public byte flowControl;
    private Spinner flowSpinner;
    @SuppressLint({"HandlerLeak"})
    Handler handler = new Handler()
    {
        public void handleMessage(Message paramAnonymousMessage)
        {
            switch (paramAnonymousMessage.what)
            {
                default:
                    return;
            }
            MainActivity.this.adapter.notifyDataSetChanged();
            MainActivity.this.listview.setSelection(MainActivity.this.listview.getCount());
        }
    };
    public boolean isConfiged = false;
    private boolean isOpen;
    public boolean isSave = false;
    private Vector<BookModel> list = new Vector();
    private ListView listview;
    public int numBytes;
    private Button openButton;
    public byte parity;
    private Spinner paritySpinner;
    public byte readIndex = 0;
    public SharedPreferences sharePrefSettings;
    public int status;
    public byte stopBit;
    private Spinner stopSpinner;
    public String strBuffer = "";
    public String strTemp = "";
    TimerTask task = new TimerTask()
    {
        public void run()
        {
            synchronized (MainActivity.this.strBuffer)
            {
                if (MainActivity.this.strBuffer.length() >= 47)
                {
                    MainActivity.this.strTemp = MainActivity.this.strBuffer;
                    MainActivity.this.strBuffer = "";
                    MainActivity.this.jiexiData(MainActivity.this.strTemp);
                    if (MainActivity.this.isSave) {
                        MainActivity.appendMethodB(MainActivity.PATH, MainActivity.this.strTemp);
                    }
                }
                return;
            }
        }
    };
    Timer timer = new Timer();
    public byte writeIndex = 0;

    public static void appendMethodB(String paramString1, String paramString2)
    {
        try
        {
            paramString1 = new FileWriter(paramString1, true);
            paramString1.write(paramString2);
            paramString1.close();
            return;
        }
        catch (IOException paramString1)
        {
            paramString1.printStackTrace();
        }
    }

    private String getFrameType1(String paramString)
    {
        try
        {
            switch (Integer.parseInt(paramString))
            {
                case 11:
                    return "数据帧";
            }
        }
        catch (Exception paramString)
        {
            paramString.printStackTrace();
            return "Reserved";
        }
        return "Reserved";
        return "管理帧";
        return "控制帧";
    }

    private String getFrameType2(String paramString1, String paramString2)
    {
        int j;
        for (;;)
        {
            try
            {
                if (paramString2.equals("0a")) {
                    break label195;
                }
                int i;
                if (paramString2.equals("0A"))
                {
                    break label195;
                    i = Integer.parseInt(paramString1);
                    j = Integer.parseInt(str);
                }
                switch (i)
                {
                    default:
                        if ((paramString2.equals("0b")) || (paramString2.equals("0B"))) {
                            break label206;
                        }
                        if ((paramString2.equals("0c")) || (paramString2.equals("0C"))) {
                            break label214;
                        }
                        if ((paramString2.equals("0d")) || (paramString2.equals("0D"))) {
                            break label222;
                        }
                        if ((paramString2.equals("0e")) || (paramString2.equals("0E"))) {
                            break label230;
                        }
                        if (paramString2.equals("0f")) {
                            break label238;
                        }
                        str = paramString2;
                        if (!paramString2.equals("0F")) {
                            continue;
                        }
                }
            }
            catch (Exception paramString1)
            {
                paramString1.printStackTrace();
                return "Reserved";
            }
            return "QoS CF-Ack+CF-Poll （未发送数据)";
            label195:
            String str = "10";
            continue;
            return "Reserved";
            label206:
            str = "11";
            continue;
            label214:
            str = "12";
            continue;
            label222:
            str = "13";
            continue;
            label230:
            str = "14";
            continue;
            label238:
            str = "15";
        }
        switch (j)
        {
            case 6:
            case 7:
            default:
                return "Reserved";
            case 0:
                return "连接要求";
            case 1:
                return "连接应答";
            case 2:
                return "重新连接要求";
            case 3:
                return "重新连接应答";
            case 4:
                return "探查要求";
            case 5:
                return "探查应答";
            case 8:
                return "导引信号";
            case 9:
                return "ATIM";
            case 10:
                return "解除连接";
            case 11:
                return "身份验证";
            case 12:
                return "解除认证";
        }
        return "动作帧";
        switch (j)
        {
            default:
                return "Reserved";
            case 9:
                return "块回应";
            case 10:
                return "省电模式-轮询";
            case 11:
                return "请求发送";
            case 12:
                return "允许发送";
            case 13:
                return "应答";
            case 14:
                return "免竞争期间结束";
        }
        return "免竞争期间回应";
        switch (j)
        {
            case 15:
            default:
                return "Reserved";
            case 0:
                return "数据";
            case 1:
                return "Data+CF-Ack";
            case 2:
                return "Data+CF-Poll";
            case 3:
                return "Data+CF-Ack+CF-Poll";
            case 4:
                return "Null data";
            case 5:
                return "CF-Ack (未发送数据)";
            case 6:
                return "CF-Poll (未发送数据)";
            case 7:
                return "Data＋CF-Ack+CF-Poll";
            case 8:
                return "QoS Data";
            case 9:
                return "QoS Data + CF-Ack";
            case 10:
                return "QoS Data + CF-Poll";
            case 11:
                return "QoS Data + CF-Ack + CF-Pol";
            case 12:
                return "QoS Null (未发送数据)";
            case 13:
                return "QoS CF-Ack (未发送数据)";
        }
        return "QoS CF-Poll (未发送数据)";
    }

    private String getevalDistance(String paramString)
    {
        String str = "0";
        try
        {
            paramString = Double.toString(1.0D * Math.pow(10.0D, (21.0D - Integer.parseInt(paramString)) / (10.0D * 3.0D)) / 100.0D);
            int i = paramString.indexOf(".");
            str = paramString;
            if (i != -1)
            {
                str = paramString;
                if (paramString.length() > i + 1) {
                    str = paramString.substring(0, i + 2);
                }
            }
            return str;
        }
        catch (Exception paramString)
        {
            for (;;)
            {
                paramString.printStackTrace();
                paramString = str;
            }
        }
    }

    private void initUI()
    {
        this.configButton = ((Button)findViewById(2131296275));
        this.openButton = ((Button)findViewById(2131296264));
        this.cunButton = ((Button)findViewById(2131296276));
        this.baudSpinner = ((Spinner)findViewById(2131296266));
        ArrayAdapter localArrayAdapter = ArrayAdapter.createFromResource(this, 2131165184, 2130903042);
        localArrayAdapter.setDropDownViewResource(2130903042);
        this.baudSpinner.setAdapter(localArrayAdapter);
        this.baudSpinner.setGravity(16);
        this.baudSpinner.setSelection(9);
        this.baudRate = 115200;
        this.stopSpinner = ((Spinner)findViewById(2131296268));
        localArrayAdapter = ArrayAdapter.createFromResource(this, 2131165185, 2130903042);
        localArrayAdapter.setDropDownViewResource(2130903042);
        this.stopSpinner.setAdapter(localArrayAdapter);
        this.stopSpinner.setGravity(1);
        this.stopBit = 1;
        this.dataSpinner = ((Spinner)findViewById(2131296270));
        localArrayAdapter = ArrayAdapter.createFromResource(this, 2131165186, 2130903042);
        localArrayAdapter.setDropDownViewResource(2130903042);
        this.dataSpinner.setAdapter(localArrayAdapter);
        this.dataSpinner.setGravity(17);
        this.dataSpinner.setSelection(3);
        this.dataBit = 8;
        this.paritySpinner = ((Spinner)findViewById(2131296272));
        localArrayAdapter = ArrayAdapter.createFromResource(this, 2131165187, 2130903042);
        localArrayAdapter.setDropDownViewResource(2130903042);
        this.paritySpinner.setAdapter(localArrayAdapter);
        this.paritySpinner.setGravity(17);
        this.parity = 0;
        this.flowSpinner = ((Spinner)findViewById(2131296274));
        localArrayAdapter = ArrayAdapter.createFromResource(this, 2131165188, 2130903042);
        localArrayAdapter.setDropDownViewResource(2130903042);
        this.flowSpinner.setAdapter(localArrayAdapter);
        this.flowSpinner.setGravity(17);
        this.flowControl = 0;
        this.baudSpinner.setOnItemSelectedListener(new MyOnBaudSelectedListener());
        this.stopSpinner.setOnItemSelectedListener(new MyOnStopSelectedListener());
        this.dataSpinner.setOnItemSelectedListener(new MyOnDataSelectedListener());
        this.paritySpinner.setOnItemSelectedListener(new MyOnParitySelectedListener());
        this.flowSpinner.setOnItemSelectedListener(new MyOnFlowSelectedListener());
    }

    private void jiexiData(String paramString)
    {
        for (;;)
        {
            int i;
            int k;
            try
            {
                paramString = paramString.split("\r\n");
                j = 0;
                i = 0;
                if (i >= paramString.length)
                {
                    if (j > 0)
                    {
                        paramString = new Message();
                        paramString.what = 1;
                        this.handler.sendMessage(paramString);
                    }
                }
                else if (paramString[i].indexOf("|") == -1)
                {
                    k = j;
                }
                else
                {
                    String[] arrayOfString = paramString[i].split("\\|");
                    k = j;
                    if (arrayOfString.length == 6)
                    {
                        k = this.list.size();
                        BookModel localBookModel = new BookModel();
                        localBookModel.s_xh = String.valueOf(k + 1);
                        localBookModel.s_ym = arrayOfString[0];
                        localBookModel.s_mm = arrayOfString[1];
                        localBookModel.s_zl = getFrameType1(arrayOfString[2]);
                        localBookModel.s_zz = getFrameType2(arrayOfString[2], arrayOfString[3]);
                        localBookModel.s_pd = arrayOfString[4];
                        localBookModel.s_qd = arrayOfString[5];
                        localBookModel.s_jl = getevalDistance(arrayOfString[5]);
                        this.list.add(localBookModel);
                        k = j + 1;
                    }
                }
            }
            catch (Exception paramString)
            {
                paramString.printStackTrace();
            }
            return;
            i += 1;
            int j = k;
        }
    }

    private byte[] toByteArray(String paramString)
    {
        if (paramString != null)
        {
            Object localObject = new char[1000];
            paramString = paramString.toCharArray();
            int i = 0;
            int j = 0;
            label34:
            int k;
            if (j >= paramString.length)
            {
                if (i % 2 != 0) {
                    break label109;
                }
                j = i;
                if (j == 0) {
                    break label261;
                }
                paramString = new int[j];
                paramString[(j - 1)] = 0;
                k = 0;
                if (k < i) {
                    break label116;
                }
                localObject = new byte[j / 2];
                i = 0;
            }
            for (;;)
            {
                if (i >= j / 2)
                {
                    return localObject;
                    k = i;
                    if (paramString[j] != ' ')
                    {
                        localObject[i] = paramString[j];
                        k = i + 1;
                    }
                    j += 1;
                    i = k;
                    break;
                    label109:
                    j = i + 1;
                    break label34;
                    label116:
                    if ((localObject[k] >= '0') && (localObject[k] <= '9')) {
                        localObject[k] -= '0';
                    }
                    for (;;)
                    {
                        k += 1;
                        break;
                        if ((localObject[k] >= 'a') && (localObject[k] <= 'f')) {
                            paramString[k] = (localObject[k] - 'a' + 10);
                        } else if ((localObject[k] >= 'A') && (localObject[k] <= 'F')) {
                            paramString[k] = (localObject[k] - 'A' + 10);
                        }
                    }
                }
                localObject[i] = ((byte)(paramString[(i * 2)] * 16 + paramString[(i * 2 + 1)]));
                i += 1;
            }
        }
        label261:
        return new byte[0];
    }

    private String toHexString(byte[] paramArrayOfByte, int paramInt)
    {
        Object localObject = new String();
        if (paramArrayOfByte != null)
        {
            int i = 0;
            if (i >= paramInt) {
                return localObject;
            }
            StringBuilder localStringBuilder = new StringBuilder(String.valueOf(localObject));
            if (paramArrayOfByte[i] < 0)
            {
                j = paramArrayOfByte[i] + 256;
                label52:
                if (Integer.toHexString(j).length() != 1) {
                    break label147;
                }
                localObject = new StringBuilder("0");
                if (paramArrayOfByte[i] >= 0) {
                    break label139;
                }
            }
            label139:
            for (int j = paramArrayOfByte[i] + 256;; j = paramArrayOfByte[i])
            {
                localObject = Integer.toHexString(j);
                localObject = (String)localObject + " ";
                i += 1;
                break;
                j = paramArrayOfByte[i];
                break label52;
            }
            label147:
            if (paramArrayOfByte[i] < 0) {}
            for (j = paramArrayOfByte[i] + 256;; j = paramArrayOfByte[i])
            {
                localObject = Integer.toHexString(j);
                break;
            }
        }
        return "";
    }

    @SuppressLint({"HandlerLeak"})
    protected void onCreate(Bundle paramBundle)
    {
        super.onCreate(paramBundle);
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        setContentView(2130903041);
        MyApp.driver = new CH34xUARTDriver((UsbManager)getSystemService("usb"), this, "cn.wch.wchusbdriver.USB_PERMISSION");
        initUI();
        if (!MyApp.driver.UsbFeatureSupported())
        {
            paramBundle = new AlertDialog.Builder(this).setTitle("提示").setMessage("您的手机不支持USB HOST，请更换其他手机再试！").setPositiveButton("确认", new DialogInterface.OnClickListener()
            {
                public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                {
                    System.exit(0);
                }
            }).create();
            paramBundle.setCanceledOnTouchOutside(false);
            paramBundle.show();
        }
        getWindow().addFlags(128);
        this.isOpen = false;
        this.configButton.setEnabled(false);
        this.cunButton.setEnabled(false);
        this.openButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View paramAnonymousView)
            {
                if (!MainActivity.this.isOpen)
                {
                    if (!MyApp.driver.ResumeUsbList())
                    {
                        Toast.makeText(MainActivity.this, "打开设备失败!", 0).show();
                        MyApp.driver.CloseDevice();
                        return;
                    }
                    if (!MyApp.driver.UartInit())
                    {
                        Toast.makeText(MainActivity.this, "设备初始化失败!", 0).show();
                        Toast.makeText(MainActivity.this, "打开设备失败!", 0).show();
                        return;
                    }
                    Toast.makeText(MainActivity.this, "打开设备成功!", 0).show();
                    MainActivity.this.isOpen = true;
                    MainActivity.this.openButton.setText("Close");
                    MainActivity.this.configButton.setEnabled(true);
                    MainActivity.this.cunButton.setEnabled(true);
                    MyApp.driver.SetConfig(MainActivity.this.baudRate, MainActivity.this.dataBit, MainActivity.this.stopBit, MainActivity.this.parity, MainActivity.this.flowControl);
                    new MainActivity.readThread(MainActivity.this, null).start();
                    MainActivity.this.timer.schedule(MainActivity.this.task, 200L, 2000L);
                    return;
                }
                MyApp.driver.CloseDevice();
                MainActivity.this.openButton.setText("Open");
                MainActivity.this.configButton.setEnabled(false);
                MainActivity.this.cunButton.setEnabled(false);
                MainActivity.this.isOpen = false;
            }
        });
        this.configButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View paramAnonymousView)
            {
                if (MyApp.driver.SetConfig(MainActivity.this.baudRate, MainActivity.this.dataBit, MainActivity.this.stopBit, MainActivity.this.parity, MainActivity.this.flowControl))
                {
                    Toast.makeText(MainActivity.this, "串口设置成功!", 0).show();
                    return;
                }
                Toast.makeText(MainActivity.this, "串口设置失败!", 0).show();
            }
        });
        this.cunButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View paramAnonymousView)
            {
                if (MainActivity.this.isSave)
                {
                    MainActivity.this.isSave = false;
                    MainActivity.this.cunButton.setText("Save");
                    Toast.makeText(MainActivity.this, "保存在根目录下doit.txt文件", 0).show();
                    return;
                }
                MainActivity.this.isSave = true;
                MainActivity.this.cunButton.setText("Stop");
            }
        });
        this.listview = ((ListView)findViewById(2131296277));
        this.adapter = new MyAdapter(this.list);
        this.listview.setAdapter(this.adapter);
        paramBundle = new File(PATH);
        if (paramBundle.exists()) {
            try
            {
                paramBundle = new FileWriter(paramBundle);
                paramBundle.write("");
                paramBundle.close();
                return;
            }
            catch (IOException paramBundle)
            {
                paramBundle.printStackTrace();
                return;
            }
        }
        try
        {
            paramBundle.createNewFile();
            return;
        }
        catch (IOException paramBundle)
        {
            paramBundle.printStackTrace();
        }
    }

    public class BookModel
    {
        public String s_jl;
        public String s_mm;
        public String s_pd;
        public String s_qd;
        public String s_xh;
        public String s_ym;
        public String s_zl;
        public String s_zz;

        public BookModel() {}
    }

    private class MyAdapter
            extends BaseAdapter
    {
        private Vector<MainActivity.BookModel> mModels;

        public MyAdapter()
        {
            Object localObject;
            this.mModels = localObject;
        }

        public int getCount()
        {
            return this.mModels.size();
        }

        public Object getItem(int paramInt)
        {
            if (paramInt >= getCount()) {
                return null;
            }
            return this.mModels.get(paramInt);
        }

        public long getItemId(int paramInt)
        {
            return paramInt;
        }

        public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
        {
            paramView = View.inflate(MainActivity.this, 2130903040, null);
            paramViewGroup = (MainActivity.BookModel)this.mModels.get(paramInt);
            TextView localTextView1 = (TextView)paramView.findViewById(2131296256);
            TextView localTextView2 = (TextView)paramView.findViewById(2131296257);
            TextView localTextView3 = (TextView)paramView.findViewById(2131296258);
            TextView localTextView4 = (TextView)paramView.findViewById(2131296259);
            TextView localTextView5 = (TextView)paramView.findViewById(2131296260);
            TextView localTextView6 = (TextView)paramView.findViewById(2131296261);
            TextView localTextView7 = (TextView)paramView.findViewById(2131296262);
            TextView localTextView8 = (TextView)paramView.findViewById(2131296263);
            localTextView1.setText(paramViewGroup.s_xh);
            localTextView2.setText(paramViewGroup.s_ym);
            localTextView3.setText(paramViewGroup.s_mm);
            localTextView4.setText(paramViewGroup.s_zl);
            localTextView5.setText(paramViewGroup.s_zz);
            localTextView6.setText(paramViewGroup.s_pd);
            localTextView7.setText(paramViewGroup.s_qd);
            localTextView8.setText(paramViewGroup.s_jl);
            return paramView;
        }
    }

    public class MyOnBaudSelectedListener
            implements AdapterView.OnItemSelectedListener
    {
        public MyOnBaudSelectedListener() {}

        public void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
        {
            MainActivity.this.baudRate = Integer.parseInt(paramAdapterView.getItemAtPosition(paramInt).toString());
        }

        public void onNothingSelected(AdapterView<?> paramAdapterView) {}
    }

    public class MyOnDataSelectedListener
            implements AdapterView.OnItemSelectedListener
    {
        public MyOnDataSelectedListener() {}

        public void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
        {
            MainActivity.this.dataBit = ((byte)Integer.parseInt(paramAdapterView.getItemAtPosition(paramInt).toString()));
        }

        public void onNothingSelected(AdapterView<?> paramAdapterView) {}
    }

    public class MyOnFlowSelectedListener
            implements AdapterView.OnItemSelectedListener
    {
        public MyOnFlowSelectedListener() {}

        public void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
        {
            paramAdapterView = new String(paramAdapterView.getItemAtPosition(paramInt).toString());
            if (paramAdapterView.compareTo("None") == 0) {
                MainActivity.this.flowControl = 0;
            }
            if (paramAdapterView.compareTo("CTS/RTS") == 0) {
                MainActivity.this.flowControl = 1;
            }
        }

        public void onNothingSelected(AdapterView<?> paramAdapterView) {}
    }

    public class MyOnParitySelectedListener
            implements AdapterView.OnItemSelectedListener
    {
        public MyOnParitySelectedListener() {}

        public void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
        {
            paramAdapterView = new String(paramAdapterView.getItemAtPosition(paramInt).toString());
            if (paramAdapterView.compareTo("None") == 0) {
                MainActivity.this.parity = 0;
            }
            if (paramAdapterView.compareTo("Odd") == 0) {
                MainActivity.this.parity = 1;
            }
            if (paramAdapterView.compareTo("Even") == 0) {
                MainActivity.this.parity = 2;
            }
            if (paramAdapterView.compareTo("Mark") == 0) {
                MainActivity.this.parity = 3;
            }
            if (paramAdapterView.compareTo("Space") == 0) {
                MainActivity.this.parity = 4;
            }
        }

        public void onNothingSelected(AdapterView<?> paramAdapterView) {}
    }

    public class MyOnStopSelectedListener
            implements AdapterView.OnItemSelectedListener
    {
        public MyOnStopSelectedListener() {}

        public void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
        {
            MainActivity.this.stopBit = ((byte)Integer.parseInt(paramAdapterView.getItemAtPosition(paramInt).toString()));
        }

        public void onNothingSelected(AdapterView<?> paramAdapterView) {}
    }

    private class readThread
            extends Thread
    {
        private readThread() {}

        public void run()
        {n
            try
            {
                Thread.sleep(200L);
                arrayOfByte = new byte[512];
                if (!MainActivity.this.isOpen) {
                    return;
                }
            }
            catch (InterruptedException localInterruptedException)
            {
                for (;;)
                {
                    byte[] arrayOfByte;
                    localInterruptedException.printStackTrace();
                    continue;
                    int i = MyApp.driver.ReadData(arrayOfByte, 512);
                    if (i <= 0) {
                        continue;
                    }
                    String str2 = new String(arrayOfByte, 0, i);
                    synchronized (MainActivity.this.strBuffer)
                    {
                        MainActivity localMainActivity = MainActivity.this;
                        localMainActivity.strBuffer += str2;
                    }
                }
            }
        }
    }
}
*/
