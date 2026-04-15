package f8;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import com.tencent.bugly.beta.tinker.TinkerReport;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Matrix f6888p = new Matrix();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f6889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f6890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f6891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Paint f6892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Paint f6893e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PathMeasure f6894f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k f6895g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f6896h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f6897i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f6898j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f6899k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f6900l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f6901m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Boolean f6902n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final o.e f6903o;

    public n() {
        this.f6891c = new Matrix();
        this.f6896h = 0.0f;
        this.f6897i = 0.0f;
        this.f6898j = 0.0f;
        this.f6899k = 0.0f;
        this.f6900l = TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK;
        this.f6901m = null;
        this.f6902n = null;
        this.f6903o = new o.e(0);
        this.f6895g = new k();
        this.f6889a = new Path();
        this.f6890b = new Path();
    }

    public final void a(k kVar, Matrix matrix, Canvas canvas, int i10, int i11) {
        int i12;
        float f10;
        int i13;
        float f11;
        Matrix matrix2 = kVar.f6874a;
        ArrayList arrayList = kVar.f6875b;
        matrix2.set(matrix);
        Matrix matrix3 = kVar.f6874a;
        matrix3.preConcat(kVar.f6883j);
        canvas.save();
        char c3 = 0;
        int i14 = 0;
        while (i14 < arrayList.size()) {
            l lVar = (l) arrayList.get(i14);
            if (lVar instanceof k) {
                a((k) lVar, matrix3, canvas, i10, i11);
            } else if (lVar instanceof m) {
                m mVar = (m) lVar;
                float f12 = i10 / this.f6898j;
                float f13 = i11 / this.f6899k;
                float fMin = Math.min(f12, f13);
                Matrix matrix4 = this.f6891c;
                matrix4.set(matrix3);
                matrix4.postScale(f12, f13);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix3.mapVectors(fArr);
                float fHypot = (float) Math.hypot(fArr[c3], fArr[1]);
                i12 = i14;
                float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f14 = (fArr[0] * fArr[3]) - (fArr[1] * fArr[2]);
                float fMax = Math.max(fHypot, fHypot2);
                float fAbs = fMax > 0.0f ? Math.abs(f14) / fMax : 0.0f;
                if (fAbs != 0.0f) {
                    Path path = this.f6889a;
                    path.reset();
                    p3.d[] dVarArr = mVar.f6885a;
                    if (dVarArr != null) {
                        p3.d.b(dVarArr, path);
                    }
                    Path path2 = this.f6890b;
                    path2.reset();
                    if (mVar instanceof i) {
                        path2.setFillType(mVar.f6887c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        j jVar = (j) mVar;
                        float f15 = jVar.f6868i;
                        if (f15 != 0.0f || jVar.f6869j != 1.0f) {
                            float f16 = jVar.f6870k;
                            float f17 = (f15 + f16) % 1.0f;
                            float f18 = (jVar.f6869j + f16) % 1.0f;
                            if (this.f6894f == null) {
                                this.f6894f = new PathMeasure();
                            }
                            this.f6894f.setPath(path, false);
                            float length = this.f6894f.getLength();
                            float f19 = f17 * length;
                            float f20 = f18 * length;
                            path.reset();
                            if (f19 > f20) {
                                this.f6894f.getSegment(f19, length, path, true);
                                f10 = 0.0f;
                                this.f6894f.getSegment(0.0f, f20, path, true);
                            } else {
                                f10 = 0.0f;
                                this.f6894f.getSegment(f19, f20, path, true);
                            }
                            path.rLineTo(f10, f10);
                        }
                        path2.addPath(path, matrix4);
                        ah.j jVar2 = jVar.f6865f;
                        if (((Shader) jVar2.f391c) == null && jVar2.f390b == 0) {
                            i13 = 16777215;
                            f11 = 255.0f;
                        } else {
                            if (this.f6893e == null) {
                                i13 = 16777215;
                                Paint paint = new Paint(1);
                                this.f6893e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i13 = 16777215;
                            }
                            Paint paint2 = this.f6893e;
                            Shader shader = (Shader) jVar2.f391c;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(jVar.f6867h * 255.0f));
                                f11 = 255.0f;
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK);
                                int i15 = jVar2.f390b;
                                float f21 = jVar.f6867h;
                                PorterDuff.Mode mode = q.f6917j;
                                f11 = 255.0f;
                                paint2.setColor((i15 & i13) | (((int) (Color.alpha(i15) * f21)) << 24));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(jVar.f6887c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        }
                        ah.j jVar3 = jVar.f6863d;
                        if (((Shader) jVar3.f391c) != null || jVar3.f390b != 0) {
                            if (this.f6892d == null) {
                                Paint paint3 = new Paint(1);
                                this.f6892d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.f6892d;
                            Paint.Join join = jVar.f6872m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = jVar.f6871l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(jVar.f6873n);
                            Shader shader2 = (Shader) jVar3.f391c;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(jVar.f6866g * f11));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK);
                                int i16 = jVar3.f390b;
                                float f22 = jVar.f6866g;
                                PorterDuff.Mode mode2 = q.f6917j;
                                paint4.setColor((i16 & i13) | (((int) (Color.alpha(i16) * f22)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(jVar.f6864e * fMin * fAbs);
                            canvas.drawPath(path2, paint4);
                        }
                    }
                }
                i14 = i12 + 1;
                c3 = 0;
            }
            i12 = i14;
            i14 = i12 + 1;
            c3 = 0;
        }
        canvas.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f6900l;
    }

    public void setAlpha(float f10) {
        setRootAlpha((int) (f10 * 255.0f));
    }

    public void setRootAlpha(int i10) {
        this.f6900l = i10;
    }

    public n(n nVar) {
        this.f6891c = new Matrix();
        this.f6896h = 0.0f;
        this.f6897i = 0.0f;
        this.f6898j = 0.0f;
        this.f6899k = 0.0f;
        this.f6900l = TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK;
        this.f6901m = null;
        this.f6902n = null;
        o.e eVar = new o.e(0);
        this.f6903o = eVar;
        this.f6895g = new k(nVar.f6895g, eVar);
        this.f6889a = new Path(nVar.f6889a);
        this.f6890b = new Path(nVar.f6890b);
        this.f6896h = nVar.f6896h;
        this.f6897i = nVar.f6897i;
        this.f6898j = nVar.f6898j;
        this.f6899k = nVar.f6899k;
        this.f6900l = nVar.f6900l;
        this.f6901m = nVar.f6901m;
        String str = nVar.f6901m;
        if (str != null) {
            eVar.put(str, this);
        }
        this.f6902n = nVar.f6902n;
    }
}
