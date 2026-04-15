package q1;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f17511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RectF f17512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float[] f17513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Matrix f17514d;

    public h(Path path) {
        this.f17511a = path;
    }

    public final p1.c a() {
        if (this.f17512b == null) {
            this.f17512b = new RectF();
        }
        RectF rectF = this.f17512b;
        jc.l.b(rectF);
        this.f17511a.computeBounds(rectF, true);
        return new p1.c(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final void b(float f10, float f11) {
        this.f17511a.lineTo(f10, f11);
    }

    public final boolean c(e0 e0Var, e0 e0Var2, int i10) {
        Path.Op op = i10 == 0 ? Path.Op.DIFFERENCE : i10 == 1 ? Path.Op.INTERSECT : i10 == 4 ? Path.Op.REVERSE_DIFFERENCE : i10 == 2 ? Path.Op.UNION : Path.Op.XOR;
        if (!(e0Var instanceof h)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = ((h) e0Var).f17511a;
        if (e0Var2 instanceof h) {
            return this.f17511a.op(path, ((h) e0Var2).f17511a, op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public final void d() {
        this.f17511a.reset();
    }

    public final void e(int i10) {
        this.f17511a.setFillType(i10 == 1 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }
}
