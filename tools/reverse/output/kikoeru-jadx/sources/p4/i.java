package p4;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f16577g = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f16578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f16579b = new int[1];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public EGLDisplay f16580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EGLContext f16581d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public EGLSurface f16582e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SurfaceTexture f16583f;

    public i(Handler handler) {
        this.f16578a = handler;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f16578a.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f16583f;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
