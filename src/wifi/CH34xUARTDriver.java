/*
package wifi;



import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbEndpoint;
import android.hardware.usb.UsbInterface;
import android.hardware.usb.UsbManager;
import android.util.Log;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class CH34xUARTDriver
{
    private UsbManager a;
    private PendingIntent b;
    private UsbDevice c;
    private UsbInterface d;
    private UsbEndpoint e;
    private UsbEndpoint f;
    private UsbDeviceConnection g;
    private String h;
    private Object i = new Object();
    private Object j = new Object();
    private boolean k = false;
    private boolean l = false;
    private b m;
    private Context mContext;
    private byte[] n = new byte[65536];
    private byte[] o = new byte[1024];
    private int p = 0;
    private int q = 0;
    private int r;
    private int s;
    private ArrayList t = new ArrayList();
    private int u;
    private int v;
    private int w;
    private int x;
    private int y = 500;
    private final BroadcastReceiver z = new a(this);

    public CH34xUARTDriver(UsbManager paramUsbManager, Context paramContext, String paramString)
    {
        this.a = paramUsbManager;
        this.mContext = paramContext;
        this.h = paramString;
        this.w = 10000;
        this.x = 10000;
        a("1a86:7523");
        a("1a86:5523");
    }

    private int a(int paramInt1, int paramInt2, int paramInt3)
    {
        return this.g.controlTransfer(64, paramInt1, paramInt2, paramInt3, null, 0, this.y);
    }

    private int a(int paramInt1, int paramInt2, int paramInt3, byte[] paramArrayOfByte, int paramInt4)
    {
        return this.g.controlTransfer(192, paramInt1, paramInt2, 0, paramArrayOfByte, 2, this.y);
    }

    private void a(UsbDevice paramUsbDevice)
    {
        int i3 = 0;
        int i2 = 0;
        if (paramUsbDevice == null) {
            return;
        }
        label9:
        Object localObject1;
        label65:
        Object localObject2;
        label133:
        do
        {
            do
            {
                if (this.g != null)
                {
                    if (this.d != null)
                    {
                        this.g.releaseInterface(this.d);
                        this.d = null;
                    }
                    this.g.close();
                    this.c = null;
                    this.d = null;
                }
                if (paramUsbDevice != null) {
                    break;
                }
                localObject1 = null;
                if ((paramUsbDevice == null) || (localObject1 == null)) {
                    break label204;
                }
                localObject2 = this.a.openDevice(paramUsbDevice);
            } while ((localObject2 == null) || (!((UsbDeviceConnection)localObject2).claimInterface((UsbInterface)localObject1, true)));
            this.c = paramUsbDevice;
            this.g = ((UsbDeviceConnection)localObject2);
            this.d = ((UsbInterface)localObject1);
            i1 = i3;
            if (localObject1 != null) {
                break label304;
            }
            i1 = i2;
            if (i1 == 0) {
                break label316;
            }
            Toast.makeText(this.mContext, "Device Has Attached to Android", 1).show();
        } while (this.l);
        this.l = true;
        this.m = new b(this, this.e, this.g);
        this.m.start();
        return;
        int i1 = 0;
        for (;;)
        {
            if (i1 >= paramUsbDevice.getInterfaceCount())
            {
                localObject1 = null;
                break label65;
                label204:
                break label9;
            }
            localObject2 = paramUsbDevice.getInterface(i1);
            if ((((UsbInterface)localObject2).getInterfaceClass() == 255) && (((UsbInterface)localObject2).getInterfaceSubclass() == 1))
            {
                localObject1 = localObject2;
                if (((UsbInterface)localObject2).getInterfaceProtocol() == 2) {
                    break;
                }
            }
            i1 += 1;
        }
        label253:
        paramUsbDevice = ((UsbInterface)localObject1).getEndpoint(i1);
        if ((paramUsbDevice.getType() == 2) && (paramUsbDevice.getMaxPacketSize() == 32)) {
            if (paramUsbDevice.getDirection() == 128)
            {
                this.e = paramUsbDevice;
                label292:
                this.v = paramUsbDevice.getMaxPacketSize();
            }
        }
        for (;;)
        {
            i1 += 1;
            label304:
            if (i1 < ((UsbInterface)localObject1).getEndpointCount()) {
                break label253;
            }
            i1 = 1;
            break label133;
            label316:
            break;
            this.f = paramUsbDevice;
            break label292;
            paramUsbDevice.getType();
        }
    }

    private void a(String paramString)
    {
        this.t.add(paramString);
        this.u = this.t.size();
    }

    public void CloseDevice()
    {
        if (this.g != null)
        {
            if (this.d != null)
            {
                this.g.releaseInterface(this.d);
                this.d = null;
            }
            this.g.close();
        }
        if (this.c != null) {
            this.c = null;
        }
        if (this.a != null) {
            this.a = null;
        }
        if (this.l) {
            this.l = false;
        }
        if (this.k)
        {
            this.mContext.unregisterReceiver(this.z);
            this.k = false;
        }
    }

    public UsbDevice EnumerateDevice()
    {
        this.a = ((UsbManager)this.mContext.getSystemService("usb"));
        this.b = PendingIntent.getBroadcast(this.mContext, 0, new Intent(this.h), 0);
        Object localObject1 = this.a.getDeviceList();
        if (((HashMap)localObject1).isEmpty())
        {
            Toast.makeText(this.mContext, "No Device Or Device Not Match", 1).show();
            return null;
        }
        Object localObject2 = ((HashMap)localObject1).values().iterator();
        for (;;)
        {
            if (!((Iterator)localObject2).hasNext()) {
                return null;
            }
            localObject1 = (UsbDevice)((Iterator)localObject2).next();
            int i1 = 0;
            while (i1 < this.u)
            {
                if (String.format("%04x:%04x", new Object[] { Integer.valueOf(((UsbDevice)localObject1).getVendorId()), Integer.valueOf(((UsbDevice)localObject1).getProductId()) }).equals(this.t.get(i1)))
                {
                    localObject2 = new IntentFilter(this.h);
                    ((IntentFilter)localObject2).addAction("android.hardware.usb.action.USB_DEVICE_DETACHED");
                    this.mContext.registerReceiver(this.z, (IntentFilter)localObject2);
                    this.k = true;
                    return localObject1;
                }
                Log.d("CH34xAndroidDriver", "String.format not match");
                i1 += 1;
            }
        }
    }

    public void OpenDevice(UsbDevice paramUsbDevice)
    {
        this.b = PendingIntent.getBroadcast(this.mContext, 0, new Intent(this.h), 0);
        if (this.a.hasPermission(paramUsbDevice))
        {
            a(paramUsbDevice);
            return;
        }
        synchronized (this.z)
        {
            this.a.requestPermission(paramUsbDevice, this.b);
            return;
        }
    }

    public int ReadData(byte[] paramArrayOfByte, int paramInt)
    {
        int i1 = 256;
        int i2 = 0;
        Object localObject = this.i;
        if (paramInt > 0) {}
        for (;;)
        {
            try
            {
                if (this.s != 0) {
                    break label119;
                }
                return 0;
            }
            finally {}
            i1 = paramInt;
            if (paramInt > this.s) {
                i1 = this.s;
            }
            this.s -= i1;
            paramInt = i2;
            if (paramInt >= i1) {
                return i1;
            }
            paramArrayOfByte[paramInt] = this.n[this.q];
            this.q += 1;
            this.q %= 65536;
            paramInt += 1;
            continue;
            label119:
            while (paramInt <= 256) {
                break;
            }
            paramInt = i1;
        }
    }

    public int ReadData(char[] paramArrayOfChar, int paramInt)
    {
        int i1 = 0;
        Object localObject = this.i;
        if (paramInt > 0) {}
        label107:
        for (;;)
        {
            try
            {
                if (this.s == 0) {
                    return 0;
                }
                if (paramInt <= this.s) {
                    break label107;
                }
                paramInt = this.s;
                this.s -= paramInt;
                if (i1 >= paramInt) {
                    return paramInt;
                }
            }
            finally {}
            paramArrayOfChar[i1] = ((char)this.n[this.q]);
            this.q += 1;
            this.q %= 65536;
            i1 += 1;
        }
    }

    public boolean ResumeUsbList()
    {
        this.a = ((UsbManager)this.mContext.getSystemService("usb"));
        Object localObject1 = this.a.getDeviceList();
        if (((HashMap)localObject1).isEmpty())
        {
            Toast.makeText(this.mContext, "No Device Or Device Not Match", 1).show();
            return false;
        }
    ??? = ((HashMap)localObject1).values().iterator();
        while (((Iterator)???).hasNext())
        {
            localObject1 = (UsbDevice)((Iterator)???).next();
            int i1 = 0;
            while (i1 < this.u)
            {
                if (String.format("%04x:%04x", new Object[] { Integer.valueOf(((UsbDevice)localObject1).getVendorId()), Integer.valueOf(((UsbDevice)localObject1).getProductId()) }).equals(this.t.get(i1)))
                {
          ??? = new IntentFilter(this.h);
                    ((IntentFilter)???).addAction("android.hardware.usb.action.USB_DEVICE_DETACHED");
                    this.mContext.registerReceiver(this.z, (IntentFilter)???);
                    this.k = true;
                    if (this.a.hasPermission((UsbDevice)localObject1)) {
                        a((UsbDevice)localObject1);
                    }
                    for (;;)
                    {
                        return true;
                        synchronized (this.z)
                        {
                            this.a.requestPermission((UsbDevice)localObject1, this.b);
                        }
                    }
                }
                Log.d("CH34xAndroidDriver", "String.format not match");
                i1 += 1;
            }
        }
    }

    public boolean SetConfig(int paramInt, byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4)
    {
        byte b1 = 100;
        byte b2 = 2;
        int i1;
        switch (paramByte3)
        {
            default:
                paramByte3 = 0;
                i1 = paramByte3;
                if (paramByte2 == 2) {
                    i1 = (char)(paramByte3 | 0x4);
                }
                switch (paramByte1)
                {
                    default:
                        paramByte1 = (char)(i1 | 0x3);
                        label102:
                        paramByte3 = (char)(paramByte1 | 0xC0);
                        paramByte1 = b1;
                        paramByte2 = b2;
                        switch (paramInt)
                        {
                            default:
                                paramByte1 = 178;
                                paramByte2 = b2;
                        }
                        break;
                }
                break;
        }
        for (;;)
        {
            paramInt = a(161, paramByte3 << 8 | 0x9C, paramByte1 << 8 | paramByte2 | 0x88 | 0x0);
            if (paramByte4 == 1) {
                a(164, -97, 0);
            }
            if (paramInt < 0) {
                break label636;
            }
            return true;
            paramByte3 = 0;
            break;
            paramByte3 = 8;
            break;
            paramByte3 = 24;
            break;
            paramByte3 = 40;
            break;
            paramByte3 = 56;
            break;
            paramByte1 = (char)i1;
            break label102;
            paramByte1 = (char)(i1 | 0x1);
            break label102;
            paramByte1 = (char)(i1 | 0x2);
            break label102;
            paramByte1 = (char)(i1 | 0x3);
            break label102;
            paramByte1 = 22;
            paramByte2 = 0;
            continue;
            paramByte2 = 0;
            paramByte1 = b1;
            continue;
            paramByte1 = 150;
            paramByte2 = 0;
            continue;
            paramByte1 = 169;
            paramByte2 = 0;
            continue;
            paramByte1 = 178;
            paramByte2 = 0;
            continue;
            paramByte1 = 217;
            paramByte2 = 0;
            continue;
            paramByte2 = 1;
            paramByte1 = b1;
            continue;
            paramByte1 = 178;
            paramByte2 = 1;
            continue;
            paramByte1 = 204;
            paramByte2 = 1;
            continue;
            paramByte1 = 217;
            paramByte2 = 1;
            continue;
            paramByte1 = 178;
            paramByte2 = b2;
            continue;
            paramByte1 = 217;
            paramByte2 = b2;
            continue;
            paramByte2 = 3;
            paramByte1 = b1;
            continue;
            paramByte1 = 152;
            paramByte2 = 3;
            continue;
            paramByte1 = 204;
            paramByte2 = 3;
            continue;
            paramByte1 = 230;
            paramByte2 = 3;
            continue;
            paramByte1 = 243;
            paramByte2 = 3;
            continue;
            paramByte1 = 244;
            paramByte2 = 3;
            continue;
            paramByte2 = 7;
            paramByte1 = 243;
            continue;
            paramByte1 = 250;
            paramByte2 = 3;
            continue;
            paramByte1 = 253;
            paramByte2 = 3;
            continue;
            paramByte1 = 254;
            paramByte2 = 3;
        }
        label636:
        return false;
    }

    public boolean SetTimeOut(int paramInt1, int paramInt2)
    {
        this.w = paramInt1;
        this.x = paramInt2;
        return true;
    }

    public boolean UartInit()
    {
        byte[] arrayOfByte = new byte[8];
        a(161, 0, 0);
        if (a(95, 0, 0, arrayOfByte, 2) < 0) {}
        do
        {
            return false;
            a(154, 4882, 55682);
            a(154, 3884, 4);
        } while (a(149, 9496, 0, arrayOfByte, 2) < 0);
        a(154, 10023, 0);
        a(164, 255, 0);
        return true;
    }

    public boolean UsbFeatureSupported()
    {
        return this.mContext.getPackageManager().hasSystemFeature("android.hardware.usb.host");
    }

    public int WriteData(byte[] paramArrayOfByte, int paramInt)
    {
        return WriteData(paramArrayOfByte, paramInt, this.w);
    }

    public int WriteData(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
        int i1 = 0;
        for (;;)
        {
            int i2;
            int i3;
            synchronized (this.j)
            {
                if (this.f != null) {
                    break label131;
                }
                return -1;
                i3 = Math.min(i2, this.v);
                byte[] arrayOfByte = new byte[i3];
                if (i1 == 0)
                {
                    System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 0, i3);
                    i3 = this.g.bulkTransfer(this.f, arrayOfByte, i3, paramInt2);
                    if (i3 < 0) {
                        return -2;
                    }
                }
                else
                {
                    System.arraycopy(paramArrayOfByte, i1, arrayOfByte, 0, i3);
                }
            }
            i2 -= i3;
            i1 += i3;
            while (i1 >= paramInt1)
            {
                return i1;
                label131:
                i2 = paramInt1;
            }
        }
    }

    protected UsbDevice getUsbDevice()
    {
        return this.c;
    }

    public boolean isConnected()
    {
        return (this.c != null) && (this.d != null) && (this.g != null);
    }
}
*/
