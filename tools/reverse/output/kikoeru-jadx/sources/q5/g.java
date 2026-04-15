package q5;

import android.opengl.GLES20;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final float[] f17792i = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final float[] f17793j = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final float[] f17794k = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ce.g f17796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h7.k f17797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17798d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17799e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f17800f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f17801g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f17802h;

    public static boolean b(f fVar) {
        e eVar = fVar.f17788a;
        e eVar2 = fVar.f17789b;
        ce.g[] gVarArr = eVar.f17787a;
        if (gVarArr.length == 1 && gVarArr[0].f3928b == 0) {
            ce.g[] gVarArr2 = eVar2.f17787a;
            if (gVarArr2.length == 1 && gVarArr2[0].f3928b == 0) {
                return true;
            }
        }
        return false;
    }

    public final void a() {
        try {
            h7.k kVar = new h7.k();
            this.f17797c = kVar;
            this.f17798d = GLES20.glGetUniformLocation(kVar.f8197b, "uMvpMatrix");
            this.f17799e = GLES20.glGetUniformLocation(this.f17797c.f8197b, "uTexMatrix");
            int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f17797c.f8197b, "aPosition");
            GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
            p4.c.d();
            this.f17800f = iGlGetAttribLocation;
            int iGlGetAttribLocation2 = GLES20.glGetAttribLocation(this.f17797c.f8197b, "aTexCoords");
            GLES20.glEnableVertexAttribArray(iGlGetAttribLocation2);
            p4.c.d();
            this.f17801g = iGlGetAttribLocation2;
            this.f17802h = GLES20.glGetUniformLocation(this.f17797c.f8197b, "uTexture");
        } catch (p4.j e10) {
            Log.e("ProjectionRenderer", "Failed to initialize the program", e10);
        }
    }
}
