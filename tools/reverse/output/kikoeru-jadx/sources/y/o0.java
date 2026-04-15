package y;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o0 implements f, h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o0 f25202b = new o0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25203a;

    public /* synthetic */ o0(int i10) {
        this.f25203a = i10;
    }

    public static final c d(int i10, String str) {
        WeakHashMap weakHashMap = s1.f25236u;
        return new c(i10, str);
    }

    public static final p1 e(int i10, String str) {
        WeakHashMap weakHashMap = s1.f25236u;
        return new p1(new u0(0, 0, 0, 0), str);
    }

    public static s1 f(x0.o oVar) {
        s1 s1Var;
        View view = (View) oVar.j(AndroidCompositionLocals_androidKt.f725f);
        WeakHashMap weakHashMap = s1.f25236u;
        synchronized (weakHashMap) {
            try {
                Object s1Var2 = weakHashMap.get(view);
                if (s1Var2 == null) {
                    s1Var2 = new s1(view);
                    weakHashMap.put(view, s1Var2);
                }
                s1Var = (s1) s1Var2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        boolean zH = oVar.h(s1Var) | oVar.h(view);
        Object objK = oVar.K();
        if (zH || objK == x0.k.f24334a) {
            objK = new r.p1(13, s1Var, view);
            oVar.h0(objK);
        }
        x0.v.c(s1Var, (ic.k) objK, oVar);
        return s1Var;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // y.f, y.h
    public float a() {
        switch (this.f25203a) {
        }
        return 0;
    }

    @Override // y.f
    public void b(f3.c cVar, int i10, int[] iArr, f3.m mVar, int[] iArr2) {
        switch (this.f25203a) {
            case 1:
                k.b(iArr, iArr2, false);
                break;
            case 2:
                k.c(i10, iArr, iArr2, false);
                break;
            case 3:
            default:
                if (mVar != f3.m.f6667a) {
                    k.c(i10, iArr, iArr2, true);
                } else {
                    k.b(iArr, iArr2, false);
                }
                break;
            case 4:
                if (mVar != f3.m.f6667a) {
                    k.b(iArr, iArr2, true);
                } else {
                    k.c(i10, iArr, iArr2, false);
                }
                break;
        }
    }

    @Override // y.h
    public void c(f3.c cVar, int i10, int[] iArr, int[] iArr2) {
        switch (this.f25203a) {
            case 3:
                k.c(i10, iArr, iArr2, false);
                break;
            default:
                k.b(iArr, iArr2, false);
                break;
        }
    }

    public String toString() {
        switch (this.f25203a) {
            case 1:
                return "AbsoluteArrangement#Left";
            case 2:
                return "AbsoluteArrangement#Right";
            case 3:
                return "Arrangement#Bottom";
            case 4:
                return "Arrangement#End";
            case 5:
                return "Arrangement#Start";
            case 6:
                return "Arrangement#Top";
            default:
                return super.toString();
        }
    }
}
