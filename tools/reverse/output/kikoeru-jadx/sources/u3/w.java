package u3;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class w implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e0 f21337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f21338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w0 f21339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f21340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f21341e;

    public w(e0 e0Var, w0 w0Var, w0 w0Var2, int i10, View view) {
        this.f21337a = e0Var;
        this.f21338b = w0Var;
        this.f21339c = w0Var2;
        this.f21340d = i10;
        this.f21341e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        e0 e0Var = this.f21337a;
        d0 d0Var = e0Var.f21286a;
        d0Var.e(animatedFraction);
        w0 w0Var = this.f21338b;
        t0 t0Var = w0Var.f21343a;
        float fC = d0Var.c();
        PathInterpolator pathInterpolator = z.f21366e;
        int i10 = Build.VERSION.SDK_INT;
        l0 k0Var = i10 >= 34 ? new k0(w0Var) : i10 >= 31 ? new j0(w0Var) : i10 >= 30 ? new i0(w0Var) : i10 >= 29 ? new h0(w0Var) : new g0(w0Var);
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((this.f21340d & i11) == 0) {
                k0Var.c(i11, t0Var.g(i11));
            } else {
                p3.b bVarG = t0Var.g(i11);
                p3.b bVarG2 = this.f21339c.f21343a.g(i11);
                float f10 = 1.0f - fC;
                k0Var.c(i11, w0.a(bVarG, (int) (((double) ((bVarG.f16525a - bVarG2.f16525a) * f10)) + 0.5d), (int) (((double) ((bVarG.f16526b - bVarG2.f16526b) * f10)) + 0.5d), (int) (((double) ((bVarG.f16527c - bVarG2.f16527c) * f10)) + 0.5d), (int) (((double) ((bVarG.f16528d - bVarG2.f16528d) * f10)) + 0.5d)));
            }
        }
        z.h(this.f21341e, k0Var.b(), Collections.singletonList(e0Var));
    }
}
