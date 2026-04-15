package f8;

import android.graphics.Paint;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j extends m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ah.j f6863d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f6864e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ah.j f6865f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f6866g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f6867h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f6868i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f6869j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f6870k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Paint.Cap f6871l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Paint.Join f6872m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f6873n;

    @Override // f8.l
    public final boolean a() {
        return this.f6865f.z() || this.f6863d.z();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    @Override // f8.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(int[] r7) {
        /*
            r6 = this;
            ah.j r0 = r6.f6865f
            boolean r1 = r0.z()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.f392d
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            int r4 = r1.getDefaultColor()
            int r1 = r1.getColorForState(r7, r4)
            int r4 = r0.f390b
            if (r1 == r4) goto L1e
            r0.f390b = r1
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            ah.j r1 = r6.f6863d
            boolean r4 = r1.z()
            if (r4 == 0) goto L3a
            java.lang.Object r4 = r1.f392d
            android.content.res.ColorStateList r4 = (android.content.res.ColorStateList) r4
            int r5 = r4.getDefaultColor()
            int r7 = r4.getColorForState(r7, r5)
            int r4 = r1.f390b
            if (r7 == r4) goto L3a
            r1.f390b = r7
            goto L3b
        L3a:
            r2 = 0
        L3b:
            r7 = r0 | r2
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: f8.j.b(int[]):boolean");
    }

    public float getFillAlpha() {
        return this.f6867h;
    }

    public int getFillColor() {
        return this.f6865f.f390b;
    }

    public float getStrokeAlpha() {
        return this.f6866g;
    }

    public int getStrokeColor() {
        return this.f6863d.f390b;
    }

    public float getStrokeWidth() {
        return this.f6864e;
    }

    public float getTrimPathEnd() {
        return this.f6869j;
    }

    public float getTrimPathOffset() {
        return this.f6870k;
    }

    public float getTrimPathStart() {
        return this.f6868i;
    }

    public void setFillAlpha(float f10) {
        this.f6867h = f10;
    }

    public void setFillColor(int i10) {
        this.f6865f.f390b = i10;
    }

    public void setStrokeAlpha(float f10) {
        this.f6866g = f10;
    }

    public void setStrokeColor(int i10) {
        this.f6863d.f390b = i10;
    }

    public void setStrokeWidth(float f10) {
        this.f6864e = f10;
    }

    public void setTrimPathEnd(float f10) {
        this.f6869j = f10;
    }

    public void setTrimPathOffset(float f10) {
        this.f6870k = f10;
    }

    public void setTrimPathStart(float f10) {
        this.f6868i = f10;
    }
}
