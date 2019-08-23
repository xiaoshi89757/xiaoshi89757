/*
package wifi;




        import android.content.BroadcastReceiver;
        import android.content.Context;
        import android.content.Intent;
        import android.hardware.usb.UsbDevice;
        import android.util.Log;
        import android.widget.Toast;

final class a
        extends BroadcastReceiver
{
    a(CH34xUARTDriver paramCH34xUARTDriver) {}

    public final void onReceive(Context paramContext, Intent paramIntent)
    {
        paramContext = paramIntent.getAction();
        if ("android.hardware.usb.action.USB_DEVICE_ATTACHED".equals(paramContext)) {
            return;
        }
        if (CH34xUARTDriver.a(this.A).equals(paramContext)) {
            for (;;)
            {
                try
                {
                    paramContext = (UsbDevice)paramIntent.getParcelableExtra("device");
                    if (paramIntent.getBooleanExtra("permission", false))
                    {
                        CH34xUARTDriver.a(this.A, paramContext);
                        return;
                    }
                }
                finally {}
                Toast.makeText(CH34xUARTDriver.b(this.A), "Deny USB Permission", 0).show();
                Log.d("CH34xAndroidDriver", "permission denied");
            }
        }
        if ("android.hardware.usb.action.USB_DEVICE_DETACHED".equals(paramContext))
        {
            Toast.makeText(CH34xUARTDriver.b(this.A), "Disconnect", 0).show();
            this.A.CloseDevice();
            return;
        }
        Log.d("CH34xAndroidDriver", "......");
    }
}
*/
