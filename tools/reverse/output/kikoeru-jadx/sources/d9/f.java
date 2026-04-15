package d9;

import i7.c2;
import i7.h2;
import i7.i2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f extends h2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n7.w f5558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n7.v f5559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s7.d f5560d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5561e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5562f;

    public f(n7.w wVar, Object obj, n7.v vVar, String[] strArr, int i10) {
        this.f5561e = i10;
        this.f5562f = obj;
        this.f5558b = wVar;
        this.f5559c = vVar;
        this.f5560d = new s7.d(strArr, this, new s7.e(3, this, f.class, "convertRows", "convertRows(Landroidx/room/RoomRawQuery;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0));
    }

    @Override // i7.h2
    public final Integer a(i2 i2Var) {
        Integer num = i2Var.f9167b;
        if (num != null) {
            return Integer.valueOf(Math.max(0, num.intValue() - (i2Var.f9168c.f9178c / 2)));
        }
        return null;
    }

    @Override // i7.h2
    public final Object c(c2 c2Var, ac.c cVar) {
        return this.f5560d.a(c2Var, cVar);
    }
}
