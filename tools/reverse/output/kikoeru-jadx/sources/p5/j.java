package p5;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.Locale;
import p4.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j extends HandlerThread implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p4.i f16685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Handler f16686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Error f16687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RuntimeException f16688d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k f16689e;

    public final void a(int i10) throws p4.j {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        this.f16685a.getClass();
        p4.i iVar = this.f16685a;
        int[] iArr = iVar.f16579b;
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        p4.c.e("eglGetDisplay failed", eGLDisplayEglGetDisplay != null);
        int[] iArr2 = new int[2];
        p4.c.e("eglInitialize failed", EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr2, 0, iArr2, 1));
        iVar.f16580c = eGLDisplayEglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr3 = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, p4.i.f16577g, 0, eGLConfigArr, 0, 1, iArr3, 0);
        boolean z10 = zEglChooseConfig && iArr3[0] > 0 && eGLConfigArr[0] != null;
        Object[] objArr = {Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr3[0]), eGLConfigArr[0]};
        int i11 = c0.f16548a;
        p4.c.e(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z10);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(iVar.f16580c, eGLConfig, EGL14.EGL_NO_CONTEXT, i10 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        p4.c.e("eglCreateContext failed", eGLContextEglCreateContext != null);
        iVar.f16581d = eGLContextEglCreateContext;
        EGLDisplay eGLDisplay = iVar.f16580c;
        if (i10 == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i10 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            p4.c.e("eglCreatePbufferSurface failed", eGLSurfaceEglCreatePbufferSurface != null);
        }
        p4.c.e("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext));
        iVar.f16582e = eGLSurfaceEglCreatePbufferSurface;
        GLES20.glGenTextures(1, iArr, 0);
        p4.c.d();
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr[0]);
        iVar.f16583f = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(iVar);
        SurfaceTexture surfaceTexture2 = this.f16685a.f16583f;
        surfaceTexture2.getClass();
        this.f16689e = new k(this, surfaceTexture2, i10 != 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        this.f16685a.getClass();
        p4.i iVar = this.f16685a;
        iVar.f16578a.removeCallbacks(iVar);
        try {
            SurfaceTexture surfaceTexture = iVar.f16583f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, iVar.f16579b, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = iVar.f16580c;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = iVar.f16580c;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = iVar.f16582e;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(iVar.f16580c, iVar.f16582e);
            }
            EGLContext eGLContext = iVar.f16581d;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(iVar.f16580c, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = iVar.f16580c;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(iVar.f16580c);
            }
            iVar.f16580c = null;
            iVar.f16581d = null;
            iVar.f16582e = null;
            iVar.f16583f = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        try {
            if (i10 == 1) {
                try {
                    a(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                    return true;
                } catch (Error e10) {
                    p4.c.o("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                    this.f16687c = e10;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e11) {
                    p4.c.o("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                    this.f16688d = e11;
                    synchronized (this) {
                        notify();
                    }
                } catch (p4.j e12) {
                    p4.c.o("PlaceholderSurface", "Failed to initialize placeholder surface", e12);
                    this.f16688d = new IllegalStateException(e12);
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i10 == 2) {
                try {
                    b();
                    return true;
                } catch (Throwable th2) {
                    try {
                        p4.c.o("PlaceholderSurface", "Failed to release placeholder surface", th2);
                        return true;
                    } finally {
                        quit();
                    }
                }
            }
            return true;
        } catch (Throwable th3) {
            synchronized (this) {
                notify();
                throw th3;
            }
        }
    }
}
