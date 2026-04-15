package j;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.tencent.bugly.beta.tinker.TinkerReport;
import gh.g;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e extends f {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public b f9561n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f9562o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public b f9563p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public g f9564q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f9565r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f9566s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f9567t;

    public e(b bVar, Resources resources) {
        this.f9573e = TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK;
        this.f9575g = -1;
        this.f9565r = -1;
        this.f9566s = -1;
        d(new b(bVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x0272, code lost:
    
        r5.onStateChange(r5.getState());
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0279, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static j.e e(android.content.Context r24, android.content.res.Resources r25, android.content.res.XmlResourceParser r26, android.util.AttributeSet r27, android.content.res.Resources.Theme r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j.e.e(android.content.Context, android.content.res.Resources, android.content.res.XmlResourceParser, android.util.AttributeSet, android.content.res.Resources$Theme):j.e");
    }

    @Override // j.f, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // j.f
    public final void d(b bVar) {
        this.f9569a = bVar;
        int i10 = this.f9575g;
        if (i10 >= 0) {
            Drawable drawableD = bVar.d(i10);
            this.f9571c = drawableD;
            if (drawableD != null) {
                b(drawableD);
            }
        }
        this.f9572d = null;
        this.f9561n = bVar;
        this.f9563p = bVar;
    }

    public final Drawable f() {
        if (!this.f9562o) {
            super.mutate();
            b bVar = this.f9561n;
            bVar.I = bVar.I.clone();
            bVar.J = bVar.J.clone();
            this.f9562o = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // j.f, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.f9564q;
        if (gVar != null) {
            gVar.P();
            this.f9564q = null;
            c(this.f9565r);
            this.f9565r = -1;
            this.f9566s = -1;
        }
    }

    @Override // j.f, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f9567t) {
            f();
            b bVar = this.f9563p;
            bVar.I = bVar.I.clone();
            bVar.J = bVar.J.clone();
            this.f9567t = true;
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d3  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onStateChange(int[] r14) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j.e.onStateChange(int[]):boolean");
    }

    @Override // j.f, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        g gVar = this.f9564q;
        if (gVar != null && (visible || z11)) {
            if (z10) {
                gVar.O();
                return visible;
            }
            jumpToCurrentState();
        }
        return visible;
    }
}
