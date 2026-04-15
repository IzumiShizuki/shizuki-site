package v4;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f22565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c4.n f22566b;

    public l(Context context) {
        this.f22565a = context;
        this.f22566b = new c4.n(context, false);
    }

    public void a(Context context, g5.r rVar, x4.v vVar, Handler handler, s sVar, ArrayList arrayList) {
        arrayList.add(new x4.x(context, this.f22566b, rVar, handler, sVar, vVar));
    }

    public final e[] b(Handler handler, s sVar, s sVar2, s sVar3, s sVar4) {
        ArrayList arrayList = new ArrayList();
        c4.n nVar = this.f22566b;
        Context context = this.f22565a;
        arrayList.add(new p5.i(context, nVar, handler, sVar));
        a(this.f22565a, g5.r.f7422d0, new x4.p(context).a(), handler, sVar2, arrayList);
        arrayList.add(new l5.d(sVar3, handler.getLooper()));
        Looper looper = handler.getLooper();
        arrayList.add(new h5.b(sVar4, looper));
        arrayList.add(new h5.b(sVar4, looper));
        arrayList.add(new q5.b());
        arrayList.add(new f5.h(f5.c.f6696c0));
        return (e[]) arrayList.toArray(new e[0]);
    }
}
