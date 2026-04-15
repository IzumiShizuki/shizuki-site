package c4;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l implements androidx.lifecycle.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3384a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3385b;

    public l(hf.k kVar) {
        this.f3385b = kVar;
    }

    @Override // androidx.lifecycle.f
    public final void b(androidx.lifecycle.x xVar) {
        switch (this.f3384a) {
            case 0:
                (Build.VERSION.SDK_INT >= 28 ? b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new o(0), 500L);
                ((androidx.lifecycle.q) this.f3385b).q1(this);
                break;
            default:
                jc.l.e(xVar, "owner");
                break;
        }
    }

    @Override // androidx.lifecycle.f
    public final /* synthetic */ void g(androidx.lifecycle.x xVar) {
        int i10 = this.f3384a;
        a0.c.o(xVar);
    }

    @Override // androidx.lifecycle.f
    public final /* synthetic */ void k(androidx.lifecycle.x xVar) {
        int i10 = this.f3384a;
    }

    @Override // androidx.lifecycle.f
    public final /* synthetic */ void n(androidx.lifecycle.x xVar) {
        int i10 = this.f3384a;
    }

    @Override // androidx.lifecycle.f
    public final /* synthetic */ void o(androidx.lifecycle.x xVar) {
        int i10 = this.f3384a;
    }

    @Override // androidx.lifecycle.f
    public final void q(androidx.lifecycle.x xVar) {
        switch (this.f3384a) {
            case 0:
                jc.l.e(xVar, "owner");
                break;
            default:
                ((hf.k) this.f3385b).h(a0.f21526a);
                break;
        }
    }

    public l(EmojiCompatInitializer emojiCompatInitializer, androidx.lifecycle.q qVar) {
        this.f3385b = qVar;
    }

    private final /* synthetic */ void a(androidx.lifecycle.x xVar) {
    }

    private final /* synthetic */ void c(androidx.lifecycle.x xVar) {
    }

    private final /* synthetic */ void d(androidx.lifecycle.x xVar) {
    }

    private final /* synthetic */ void e(androidx.lifecycle.x xVar) {
    }

    private final /* synthetic */ void f(androidx.lifecycle.x xVar) {
    }

    private final /* synthetic */ void h(androidx.lifecycle.x xVar) {
    }
}
