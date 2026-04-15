package fh;

import android.os.Build;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import jc.l;
import q.t0;
import ug.x;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile e f7102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f7103b;

    static {
        try {
            for (Map.Entry entry : gh.c.f7552b.entrySet()) {
                gh.c.b((String) entry.getKey(), (String) entry.getValue());
            }
        } catch (RuntimeException e10) {
            System.err.println("Possibly running android unit test without robolectric");
            e10.printStackTrace();
        } catch (UnsatisfiedLinkError e11) {
            System.err.println("Possibly running android unit test without robolectric");
            e11.printStackTrace();
        }
        e aVar = a.f7094e ? new a() : null;
        if (aVar == null) {
            aVar = c.f7099e ? new c() : null;
        }
        if (aVar == null) {
            throw new IllegalStateException(t0.B(Build.VERSION.SDK_INT, "Expected Android API level 21+ but was "));
        }
        f7102a = aVar;
        f7103b = Logger.getLogger(x.class.getName());
    }

    public abstract android.support.v4.media.session.b c(X509TrustManager x509TrustManager);

    public jh.d d(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        return new jh.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public abstract void e(SSLSocket sSLSocket, String str, List list);

    public void f(Socket socket, InetSocketAddress inetSocketAddress, int i10) throws IOException {
        l.e(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i10);
    }

    public abstract String g(SSLSocket sSLSocket);

    public Object h() {
        if (f7103b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public abstract boolean i(String str);

    public abstract void j(String str, int i10, Throwable th2);

    public void k(Object obj, String str) {
        l.e(str, "message");
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        j(str, 5, (Throwable) obj);
    }

    public SSLContext l() {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        l.d(sSLContext, "getInstance(...)");
        return sSLContext;
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}
