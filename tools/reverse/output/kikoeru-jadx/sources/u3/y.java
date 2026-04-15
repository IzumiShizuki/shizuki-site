package u3;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class y implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f21364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w0 f21365b;

    public y(View view, v vVar) {
        w0 w0VarB;
        this.f21364a = vVar;
        Field field = s.f21328a;
        int i10 = Build.VERSION.SDK_INT;
        w0 w0VarA = i10 >= 23 ? m.a(view) : l.b(view);
        if (w0VarA != null) {
            w0VarB = (i10 >= 34 ? new k0(w0VarA) : i10 >= 31 ? new j0(w0VarA) : i10 >= 30 ? new i0(w0VarA) : i10 >= 29 ? new h0(w0VarA) : new g0(w0VarA)).b();
        } else {
            w0VarB = null;
        }
        this.f21365b = w0VarB;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int[] iArr;
        boolean z10;
        if (!view.isLaidOut()) {
            this.f21365b = w0.c(view, windowInsets);
            return z.j(view, windowInsets);
        }
        w0 w0VarC = w0.c(view, windowInsets);
        t0 t0Var = w0VarC.f21343a;
        if (this.f21365b == null) {
            Field field = s.f21328a;
            this.f21365b = Build.VERSION.SDK_INT >= 23 ? m.a(view) : l.b(view);
        }
        if (this.f21365b == null) {
            this.f21365b = w0VarC;
            return z.j(view, windowInsets);
        }
        v vVarK = z.k(view);
        if (vVarK != null && Objects.equals((w0) vVarK.f21336b, w0VarC)) {
            return z.j(view, windowInsets);
        }
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        w0 w0Var = this.f21365b;
        int i10 = 1;
        while (i10 <= 512) {
            p3.b bVarG = t0Var.g(i10);
            p3.b bVarG2 = w0Var.f21343a.g(i10);
            int i11 = bVarG.f16525a;
            int i12 = bVarG.f16528d;
            int i13 = bVarG.f16527c;
            int i14 = bVarG.f16526b;
            int i15 = bVarG2.f16525a;
            int i16 = bVarG2.f16528d;
            int i17 = bVarG2.f16527c;
            int i18 = bVarG2.f16526b;
            if (i11 > i15 || i14 > i18 || i13 > i17 || i12 > i16) {
                iArr = iArr2;
                z10 = true;
            } else {
                iArr = iArr2;
                z10 = false;
            }
            if (z10 != (i11 < i15 || i14 < i18 || i13 < i17 || i12 < i16)) {
                if (z10) {
                    iArr[0] = iArr[0] | i10;
                } else {
                    iArr3[0] = iArr3[0] | i10;
                }
            }
            i10 <<= 1;
            iArr2 = iArr;
        }
        int i19 = iArr2[0];
        int i20 = iArr3[0];
        int i21 = i19 | i20;
        if (i21 == 0) {
            this.f21365b = w0VarC;
            return z.j(view, windowInsets);
        }
        w0 w0Var2 = this.f21365b;
        e0 e0Var = new e0(i21, (i19 & 8) != 0 ? z.f21366e : (i20 & 8) != 0 ? z.f21367f : (i19 & 519) != 0 ? z.f21368g : (i20 & 519) != 0 ? z.f21369h : null, (i21 & 8) != 0 ? 160L : 250L);
        e0Var.f21286a.e(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(e0Var.f21286a.b());
        p3.b bVarG3 = t0Var.g(i21);
        p3.b bVarG4 = w0Var2.f21343a.g(i21);
        int iMin = Math.min(bVarG3.f16525a, bVarG4.f16525a);
        int i22 = bVarG3.f16526b;
        int i23 = bVarG4.f16526b;
        int iMin2 = Math.min(i22, i23);
        int i24 = bVarG3.f16527c;
        int i25 = bVarG4.f16527c;
        int iMin3 = Math.min(i24, i25);
        int i26 = bVarG3.f16528d;
        int i27 = bVarG4.f16528d;
        m0.w wVar = new m0.w(25, p3.b.b(iMin, iMin2, iMin3, Math.min(i26, i27)), p3.b.b(Math.max(bVarG3.f16525a, bVarG4.f16525a), Math.max(i22, i23), Math.max(i24, i25), Math.max(i26, i27)));
        z.g(view, e0Var, w0VarC, false);
        duration.addUpdateListener(new w(e0Var, w0VarC, w0Var2, i21, view));
        duration.addListener(new x(view, e0Var));
        g gVar = new g(view, new c7.c0(view, e0Var, wVar, duration, 2));
        view.getViewTreeObserver().addOnPreDrawListener(gVar);
        view.addOnAttachStateChangeListener(gVar);
        this.f21365b = w0VarC;
        return z.j(view, windowInsets);
    }
}
