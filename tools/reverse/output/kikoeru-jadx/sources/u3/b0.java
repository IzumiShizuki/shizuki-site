package u3;

import android.os.Build;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends WindowInsetsAnimation.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f21271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f21272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f21273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f21274d;

    public b0(v vVar) {
        super(vVar.f21335a);
        this.f21274d = new HashMap();
        this.f21271a = vVar;
    }

    public final e0 a(WindowInsetsAnimation windowInsetsAnimation) {
        e0 e0Var = (e0) this.f21274d.get(windowInsetsAnimation);
        if (e0Var == null) {
            e0Var = new e0(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                e0Var.f21286a = new c0(windowInsetsAnimation);
            }
            this.f21274d.put(windowInsetsAnimation, e0Var);
        }
        return e0Var;
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.f21271a.a(a(windowInsetsAnimation));
        this.f21274d.remove(windowInsetsAnimation);
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        v vVar = this.f21271a;
        a(windowInsetsAnimation);
        vVar.b();
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f21273c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f21273c = arrayList2;
            this.f21272b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationE = a0.e(list.get(size));
            e0 e0VarA = a(windowInsetsAnimationE);
            e0VarA.f21286a.e(windowInsetsAnimationE.getFraction());
            this.f21273c.add(e0VarA);
        }
        return this.f21271a.d(w0.c(null, windowInsets), this.f21272b).b();
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        m0.w wVarE = this.f21271a.e(a(windowInsetsAnimation), new m0.w(bounds));
        wVarE.getClass();
        b7.u0.m();
        return b7.u0.i(((p3.b) wVarE.f13782b).d(), ((p3.b) wVarE.f13783c).d());
    }
}
