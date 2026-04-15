package q5;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;
import b5.d0;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import p4.s;
import p5.q;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i implements q, a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f17812i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public SurfaceTexture f17813j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte[] f17816m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f17804a = new AtomicBoolean();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f17805b = new AtomicBoolean(true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f17806c = new g();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d0 f17807d = new d0(6, false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ce.g f17808e = new ce.g((byte) 0, 2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ce.g f17809f = new ce.g((byte) 0, 2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f17810g = new float[16];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f17811h = new float[16];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile int f17814k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f17815l = -1;

    @Override // q5.a
    public final void a(long j10, float[] fArr) {
        ((ce.g) this.f17807d.f1523d).a(j10, fArr);
    }

    @Override // q5.a
    public final void b() {
        this.f17808e.c();
        d0 d0Var = this.f17807d;
        ((ce.g) d0Var.f1523d).c();
        d0Var.f1520a = false;
        this.f17805b.set(true);
    }

    @Override // p5.q
    public final void c(long j10, long j11, m4.q qVar, MediaFormat mediaFormat) {
        ArrayList arrayListY;
        int iG;
        this.f17808e.a(j11, Long.valueOf(j10));
        byte[] bArr = qVar.f14556z;
        int i10 = qVar.A;
        byte[] bArr2 = this.f17816m;
        int i11 = this.f17815l;
        this.f17816m = bArr;
        if (i10 == -1) {
            i10 = this.f17814k;
        }
        this.f17815l = i10;
        if (i11 == i10 && Arrays.equals(bArr2, this.f17816m)) {
            return;
        }
        byte[] bArr3 = this.f17816m;
        f fVar = null;
        if (bArr3 != null) {
            int i12 = this.f17815l;
            s sVar = new s(bArr3);
            try {
                sVar.H(4);
                iG = sVar.g();
                sVar.G(0);
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            if (iG == 1886547818) {
                sVar.H(8);
                int i13 = sVar.f16612b;
                int i14 = sVar.f16613c;
                while (i13 < i14) {
                    int iG2 = sVar.g() + i13;
                    if (iG2 > i13 && iG2 <= i14) {
                        int iG3 = sVar.g();
                        if (iG3 != 2037673328 && iG3 != 1836279920) {
                            sVar.G(iG2);
                            i13 = iG2;
                        }
                        sVar.F(iG2);
                        arrayListY = nh.a.y(sVar);
                        break;
                    }
                    break;
                }
                arrayListY = null;
            } else {
                arrayListY = nh.a.y(sVar);
            }
            if (arrayListY != null) {
                int size = arrayListY.size();
                if (size == 1) {
                    e eVar = (e) arrayListY.get(0);
                    fVar = new f(eVar, eVar, i12);
                } else if (size == 2) {
                    fVar = new f((e) arrayListY.get(0), (e) arrayListY.get(1), i12);
                }
            }
        }
        if (fVar == null || !g.b(fVar)) {
            int i15 = this.f17815l;
            float radians = (float) Math.toRadians(180.0f);
            float radians2 = (float) Math.toRadians(360.0f);
            float f10 = radians / 36;
            float f11 = radians2 / 72;
            float[] fArr = new float[15984];
            float[] fArr2 = new float[10656];
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            for (int i19 = 36; i16 < i19; i19 = 36) {
                float f12 = radians / 2.0f;
                float f13 = (i16 * f10) - f12;
                int i20 = i16 + 1;
                float f14 = (i20 * f10) - f12;
                int i21 = 0;
                while (i21 < 73) {
                    int i22 = i20;
                    float f15 = f14;
                    float f16 = radians;
                    int i23 = i17;
                    int i24 = i18;
                    int i25 = 0;
                    while (i25 < 2) {
                        float f17 = i25 == 0 ? f13 : f15;
                        float f18 = radians2;
                        float f19 = i21 * f11;
                        float f20 = f13;
                        float f21 = f10;
                        double d10 = 50.0f;
                        double d11 = (f19 + 3.1415927f) - (f18 / 2.0f);
                        double d12 = f17;
                        fArr[i23] = -((float) (Math.cos(d12) * Math.sin(d11) * d10));
                        fArr[i23 + 1] = (float) (Math.sin(d12) * d10);
                        int i26 = i23 + 3;
                        fArr[i23 + 2] = (float) (Math.cos(d12) * Math.cos(d11) * d10);
                        fArr2[i24] = f19 / f18;
                        int i27 = i24 + 2;
                        fArr2[i24 + 1] = ((i16 + i25) * f21) / f16;
                        if ((i21 == 0 && i25 == 0) || (i21 == 72 && i25 == 1)) {
                            System.arraycopy(fArr, i23, fArr, i26, 3);
                            i23 += 6;
                            System.arraycopy(fArr2, i24, fArr2, i27, 2);
                            i24 += 4;
                        } else {
                            i23 = i26;
                            i24 = i27;
                        }
                        i25++;
                        radians2 = f18;
                        f13 = f20;
                        f10 = f21;
                    }
                    i21++;
                    i17 = i23;
                    i18 = i24;
                    i20 = i22;
                    f14 = f15;
                    radians = f16;
                    radians2 = radians2;
                    f10 = f10;
                }
                i16 = i20;
            }
            e eVar2 = new e(new ce.g(0, 1, fArr, fArr2));
            fVar = new f(eVar2, eVar2, i15);
        }
        this.f17809f.a(j11, fVar);
    }

    public final void d(float[] fArr) {
        Object objW;
        GLES20.glClear(16384);
        try {
            p4.c.d();
        } catch (p4.j e10) {
            p4.c.o("SceneRenderer", "Failed to draw a frame", e10);
        }
        if (this.f17804a.compareAndSet(true, false)) {
            SurfaceTexture surfaceTexture = this.f17813j;
            surfaceTexture.getClass();
            surfaceTexture.updateTexImage();
            try {
                p4.c.d();
            } catch (p4.j e11) {
                p4.c.o("SceneRenderer", "Failed to draw a frame", e11);
            }
            if (this.f17805b.compareAndSet(true, false)) {
                Matrix.setIdentityM(this.f17810g, 0);
            }
            long timestamp = this.f17813j.getTimestamp();
            ce.g gVar = this.f17808e;
            synchronized (gVar) {
                objW = gVar.w(timestamp, false);
            }
            Long l10 = (Long) objW;
            if (l10 != null) {
                d0 d0Var = this.f17807d;
                float[] fArr2 = this.f17810g;
                float[] fArr3 = (float[]) ((ce.g) d0Var.f1523d).y(l10.longValue());
                if (fArr3 != null) {
                    float[] fArr4 = (float[]) d0Var.f1522c;
                    float f10 = fArr3[0];
                    float f11 = -fArr3[1];
                    float f12 = -fArr3[2];
                    float length = Matrix.length(f10, f11, f12);
                    if (length != 0.0f) {
                        Matrix.setRotateM(fArr4, 0, (float) Math.toDegrees(length), f10 / length, f11 / length, f12 / length);
                    } else {
                        Matrix.setIdentityM(fArr4, 0);
                    }
                    if (!d0Var.f1520a) {
                        d0.g((float[]) d0Var.f1521b, (float[]) d0Var.f1522c);
                        d0Var.f1520a = true;
                    }
                    Matrix.multiplyMM(fArr2, 0, (float[]) d0Var.f1521b, 0, (float[]) d0Var.f1522c, 0);
                }
            }
            f fVar = (f) this.f17809f.y(timestamp);
            if (fVar != null) {
                g gVar2 = this.f17806c;
                gVar2.getClass();
                if (g.b(fVar)) {
                    gVar2.f17795a = fVar.f17790c;
                    gVar2.f17796b = new ce.g(fVar.f17788a.f17787a[0]);
                    if (!fVar.f17791d) {
                        new ce.g(fVar.f17789b.f17787a[0]);
                    }
                }
            }
        }
        Matrix.multiplyMM(this.f17811h, 0, fArr, 0, this.f17810g, 0);
        g gVar3 = this.f17806c;
        int i10 = this.f17812i;
        float[] fArr5 = this.f17811h;
        ce.g gVar4 = gVar3.f17796b;
        if (gVar4 == null) {
            return;
        }
        int i11 = gVar3.f17795a;
        GLES20.glUniformMatrix3fv(gVar3.f17799e, 1, false, i11 == 1 ? g.f17793j : i11 == 2 ? g.f17794k : g.f17792i, 0);
        GLES20.glUniformMatrix4fv(gVar3.f17798d, 1, false, fArr5, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i10);
        GLES20.glUniform1i(gVar3.f17802h, 0);
        try {
            p4.c.d();
        } catch (p4.j e12) {
            Log.e("ProjectionRenderer", "Failed to bind uniforms", e12);
        }
        GLES20.glVertexAttribPointer(gVar3.f17800f, 3, 5126, false, 12, (Buffer) gVar4.f3930d);
        try {
            p4.c.d();
        } catch (p4.j e13) {
            Log.e("ProjectionRenderer", "Failed to load position data", e13);
        }
        GLES20.glVertexAttribPointer(gVar3.f17801g, 2, 5126, false, 8, (Buffer) gVar4.f3931e);
        try {
            p4.c.d();
        } catch (p4.j e14) {
            Log.e("ProjectionRenderer", "Failed to load texture data", e14);
        }
        GLES20.glDrawArrays(gVar4.f3929c, 0, gVar4.f3928b);
        try {
            p4.c.d();
        } catch (p4.j e15) {
            Log.e("ProjectionRenderer", "Failed to render", e15);
        }
    }

    public final SurfaceTexture e() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            p4.c.d();
            this.f17806c.a();
            p4.c.d();
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            p4.c.d();
            int i10 = iArr[0];
            GLES20.glBindTexture(36197, i10);
            p4.c.d();
            GLES20.glTexParameteri(36197, 10240, 9729);
            p4.c.d();
            GLES20.glTexParameteri(36197, 10241, 9729);
            p4.c.d();
            GLES20.glTexParameteri(36197, 10242, 33071);
            p4.c.d();
            GLES20.glTexParameteri(36197, 10243, 33071);
            p4.c.d();
            this.f17812i = i10;
        } catch (p4.j e10) {
            p4.c.o("SceneRenderer", "Failed to initialize the renderer", e10);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f17812i);
        this.f17813j = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: q5.h
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.f17803a.f17804a.set(true);
            }
        });
        return this.f17813j;
    }
}
