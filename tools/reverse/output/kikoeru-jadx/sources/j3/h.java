package j3;

import android.os.Handler;
import android.os.Looper;
import g2.c0;
import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f10135c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(u uVar, int i10) {
        super(1);
        this.f10134b = i10;
        this.f10135c = uVar;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f10134b) {
            case 0:
                c0 c0VarB = ((c0) obj).B();
                jc.l.b(c0VarB);
                this.f10135c.m(c0VarB);
                break;
            case 1:
                f3.l lVar = new f3.l(((f3.l) obj).f6666a);
                u uVar = this.f10135c;
                uVar.m8setPopupContentSizefhxjrPA(lVar);
                uVar.n();
                break;
            default:
                ic.a aVar = (ic.a) obj;
                u uVar2 = this.f10135c;
                Handler handler = uVar2.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    aVar.b();
                } else {
                    Handler handler2 = uVar2.getHandler();
                    if (handler2 != null) {
                        handler2.post(new i3.a(4, aVar));
                    }
                }
                break;
        }
        return a0.f21526a;
    }
}
