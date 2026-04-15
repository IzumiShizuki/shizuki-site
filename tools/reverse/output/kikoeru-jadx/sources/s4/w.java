package s4;

import com.tencent.bugly.CrashModule;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class w extends j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19483c;

    public w() {
        super(2008);
        this.f19483c = 1;
    }

    public static w a(IOException iOException, int i10) {
        String message = iOException.getMessage();
        int i11 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? CrashModule.MODULE_ID : (message == null || !ud.e.c0(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i11 == 2007 ? new v("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, 2007) : new w(iOException, i11, i10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public w(IOException iOException, int i10, int i11) {
        if (i10 == 2000 && i11 == 1) {
            i10 = 2001;
        }
        super(iOException, i10);
        this.f19483c = i11;
    }

    public w(String str, IOException iOException, int i10) {
        super(str, iOException, i10 == 2000 ? 2001 : i10);
        this.f19483c = 1;
    }
}
