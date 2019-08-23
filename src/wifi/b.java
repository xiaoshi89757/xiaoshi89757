/*
package wifi;


import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbEndpoint;

final class b
        extends Thread
{
    private UsbEndpoint B;
    private UsbDeviceConnection C;

    b(CH34xUARTDriver paramCH34xUARTDriver, UsbEndpoint paramUsbEndpoint, UsbDeviceConnection paramUsbDeviceConnection)
    {
        this.B = paramUsbEndpoint;
        this.C = paramUsbDeviceConnection;
        setPriority(10);
    }

    public final void run()
    {
        for (;;)
        {
            if (!CH34xUARTDriver.c(this.A)) {
                return;
            }
            try
            {
                do
                {
                    Thread.sleep(5L);
                } while (CH34xUARTDriver.d(this.A) > 65281);
                if (this.B != null)
                {
                    CH34xUARTDriver.a(this.A, this.C.bulkTransfer(this.B, CH34xUARTDriver.e(this.A), 32, CH34xUARTDriver.f(this.A)));
                    if (CH34xUARTDriver.g(this.A) > 0)
                    {
                        i = 0;
                        if (i >= CH34xUARTDriver.g(this.A))
                        {
                            if (CH34xUARTDriver.i(this.A) < CH34xUARTDriver.j(this.A)) {
                                break label205;
                            }
                            CH34xUARTDriver.c(this.A, CH34xUARTDriver.i(this.A) - CH34xUARTDriver.j(this.A));
                        }
                    }
                }
            }
            catch (InterruptedException localInterruptedException)
            {
                for (;;)
                {
                    int i;
                    localInterruptedException.printStackTrace();
                    continue;
                    CH34xUARTDriver.h(this.A)[CH34xUARTDriver.i(this.A)] = CH34xUARTDriver.e(this.A)[i];
                    CH34xUARTDriver localCH34xUARTDriver = this.A;
                    CH34xUARTDriver.b(localCH34xUARTDriver, CH34xUARTDriver.i(localCH34xUARTDriver) + 1);
                    localCH34xUARTDriver = this.A;
                    CH34xUARTDriver.b(localCH34xUARTDriver, CH34xUARTDriver.i(localCH34xUARTDriver) % 65536);
                    i += 1;
                }
                label205:
                CH34xUARTDriver.c(this.A, 65536 - CH34xUARTDriver.j(this.A) + CH34xUARTDriver.i(this.A));
            }
        }
    }
}
*/
