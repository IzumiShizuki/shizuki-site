package q1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Canvas f17490a = c.f17494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Rect f17491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Rect f17492c;

    @Override // q1.o
    public final void a(p1.c cVar, p4.p pVar) {
        this.f17490a.saveLayer(cVar.f16483a, cVar.f16484b, cVar.f16485c, cVar.f16486d, (Paint) pVar.f16600b, 31);
    }

    @Override // q1.o
    public final void b(float f10, float f11) {
        this.f17490a.scale(f10, f11);
    }

    @Override // q1.o
    public final void c(float f10) {
        this.f17490a.rotate(f10);
    }

    @Override // q1.o
    public final void d(float f10, long j10, p4.p pVar) {
        this.f17490a.drawCircle(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)), f10, (Paint) pVar.f16600b);
    }

    @Override // q1.o
    public final void e(float f10, float f11, float f12, float f13, float f14, float f15, p4.p pVar) {
        this.f17490a.drawRoundRect(f10, f11, f12, f13, f14, f15, (Paint) pVar.f16600b);
    }

    @Override // q1.o
    public final void f() {
        this.f17490a.save();
    }

    @Override // q1.o
    public final void g(f fVar, long j10, long j11, long j12, p4.p pVar) {
        if (this.f17491b == null) {
            this.f17491b = new Rect();
            this.f17492c = new Rect();
        }
        Canvas canvas = this.f17490a;
        Bitmap bitmapK = h0.k(fVar);
        Rect rect = this.f17491b;
        jc.l.b(rect);
        int i10 = (int) (j10 >> 32);
        rect.left = i10;
        int i11 = (int) (j10 & 4294967295L);
        rect.top = i11;
        rect.right = i10 + ((int) (j11 >> 32));
        rect.bottom = i11 + ((int) (j11 & 4294967295L));
        Rect rect2 = this.f17492c;
        jc.l.b(rect2);
        int i12 = (int) 0;
        rect2.left = i12;
        int i13 = (int) 0;
        rect2.top = i13;
        rect2.right = i12 + ((int) (j12 >> 32));
        rect2.bottom = i13 + ((int) (j12 & 4294967295L));
        canvas.drawBitmap(bitmapK, rect, rect2, (Paint) pVar.f16600b);
    }

    @Override // q1.o
    public final void h() {
        h0.n(this.f17490a, false);
    }

    @Override // q1.o
    public final void i(long j10, long j11, p4.p pVar) {
        this.f17490a.drawLine(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)), Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)), (Paint) pVar.f16600b);
    }

    @Override // q1.o
    public final void j(float f10, float f11, float f12, float f13, p4.p pVar) {
        this.f17490a.drawRect(f10, f11, f12, f13, (Paint) pVar.f16600b);
    }

    @Override // q1.o
    public final void k(float[] fArr) {
        if (h0.p(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        h0.u(matrix, fArr);
        this.f17490a.concat(matrix);
    }

    @Override // q1.o
    public final void l(e0 e0Var, p4.p pVar) {
        Canvas canvas = this.f17490a;
        if (!(e0Var instanceof h)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((h) e0Var).f17511a, (Paint) pVar.f16600b);
    }

    @Override // q1.o
    public final void m(p1.c cVar) {
        o(cVar.f16483a, cVar.f16484b, cVar.f16485c, cVar.f16486d, 1);
    }

    @Override // q1.o
    public final void n(e0 e0Var) {
        Canvas canvas = this.f17490a;
        if (!(e0Var instanceof h)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((h) e0Var).f17511a, Region.Op.INTERSECT);
    }

    @Override // q1.o
    public final void o(float f10, float f11, float f12, float f13, int i10) {
        this.f17490a.clipRect(f10, f11, f12, f13, i10 == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // q1.o
    public final void p(float f10, float f11) {
        this.f17490a.translate(f10, f11);
    }

    @Override // q1.o
    public final void q(f fVar, p4.p pVar) {
        this.f17490a.drawBitmap(h0.k(fVar), Float.intBitsToFloat((int) 0), Float.intBitsToFloat((int) 0), (Paint) pVar.f16600b);
    }

    @Override // q1.o
    public final void r() {
        this.f17490a.restore();
    }

    @Override // q1.o
    public final void s(ArrayList arrayList, p4.p pVar) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            long j10 = ((p1.b) arrayList.get(i10)).f16481a;
            this.f17490a.drawPoint(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)), (Paint) pVar.f16600b);
        }
    }

    @Override // q1.o
    public final void t(float f10, float f11, float f12, float f13, float f14, float f15, p4.p pVar) {
        this.f17490a.drawArc(f10, f11, f12, f13, f14, f15, false, (Paint) pVar.f16600b);
    }

    @Override // q1.o
    public final void u() {
        h0.n(this.f17490a, true);
    }
}
