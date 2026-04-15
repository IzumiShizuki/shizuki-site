package q5;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j implements GLSurfaceView.Renderer, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f17817a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f17820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float[] f17821e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float[] f17822f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f17823g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f17824h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ k f17827k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f17818b = new float[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float[] f17819c = new float[16];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f17825i = new float[16];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float[] f17826j = new float[16];

    public j(k kVar, i iVar) {
        this.f17827k = kVar;
        float[] fArr = new float[16];
        this.f17820d = fArr;
        float[] fArr2 = new float[16];
        this.f17821e = fArr2;
        float[] fArr3 = new float[16];
        this.f17822f = fArr3;
        this.f17817a = iVar;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr3, 0);
        this.f17824h = 3.1415927f;
    }

    @Override // q5.c
    public final synchronized void a(float[] fArr, float f10) {
        float[] fArr2 = this.f17820d;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        float f11 = -f10;
        this.f17824h = f11;
        Matrix.setRotateM(this.f17821e, 0, -this.f17823g, (float) Math.cos(f11), (float) Math.sin(this.f17824h), 0.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        synchronized (this) {
            Matrix.multiplyMM(this.f17826j, 0, this.f17820d, 0, this.f17822f, 0);
            Matrix.multiplyMM(this.f17825i, 0, this.f17821e, 0, this.f17826j, 0);
        }
        Matrix.multiplyMM(this.f17819c, 0, this.f17818b, 0, this.f17825i, 0);
        this.f17817a.d(this.f17819c);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i10, int i11) {
        GLES20.glViewport(0, 0, i10, i11);
        float f10 = i10 / i11;
        Matrix.perspectiveM(this.f17818b, 0, f10 > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f10))) * 2.0d) : 90.0f, f10, 0.1f, 100.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        k kVar = this.f17827k;
        kVar.f17832e.post(new b5.h(24, kVar, this.f17817a.e()));
    }
}
