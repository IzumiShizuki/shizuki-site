package gh;

import android.os.Build;
import g5.w;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class e implements n {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final w f7554f = new w(12);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f7555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f7556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f7557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Method f7558d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Method f7559e;

    public e(Class cls) throws NoSuchMethodException {
        this.f7555a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        jc.l.d(declaredMethod, "getDeclaredMethod(...)");
        this.f7556b = declaredMethod;
        this.f7557c = cls.getMethod("setHostname", String.class);
        this.f7558d = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f7559e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // gh.n
    public final boolean a(SSLSocket sSLSocket) {
        return this.f7555a.isInstance(sSLSocket);
    }

    @Override // gh.n
    public final boolean b() {
        boolean z10 = fh.c.f7099e;
        return fh.c.f7099e;
    }

    @Override // gh.n
    public final String c(SSLSocket sSLSocket) {
        if (this.f7555a.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.f7558d.invoke(sSLSocket, null);
                if (bArr != null) {
                    return new String(bArr, ef.a.f6541a);
                }
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                Throwable cause = e11.getCause();
                if (!(cause instanceof NullPointerException) || !jc.l.a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    throw new AssertionError(e11);
                }
            }
        }
        return null;
    }

    @Override // gh.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        jc.l.e(list, "protocols");
        if (this.f7555a.isInstance(sSLSocket)) {
            try {
                this.f7556b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null && Build.VERSION.SDK_INT <= 23) {
                    this.f7557c.invoke(sSLSocket, str);
                }
                Method method = this.f7559e;
                fh.e eVar = fh.e.f7102a;
                method.invoke(sSLSocket, pe.d.A(list));
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                throw new AssertionError(e11);
            }
        }
    }
}
