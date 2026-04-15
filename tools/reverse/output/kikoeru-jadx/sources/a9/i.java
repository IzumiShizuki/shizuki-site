package a9;

import com.cnl.kikoeru.MainApplication;
import com.cnl.kikoeru.data.db.AppDatabase;
import jc.a0;
import jc.z;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ pc.u[] f230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ub.p f231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final hg.b f232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ub.p f233d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final hg.b f234e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ub.p f235f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ub.p f236g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final hg.b f237h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ub.p f238i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ub.p f239j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ub.p f240k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ub.p f241l;

    static {
        jc.r rVar = new jc.r(i.class, "token", "getToken()Ljava/lang/String;", 1);
        a0 a0Var = z.f10839a;
        f230a = new pc.u[]{a0Var.f(rVar), a0Var.f(new jc.r(i.class, "recommenderUuid", "getRecommenderUuid()Ljava/lang/String;", 1)), a0Var.f(new jc.r(i.class, "forceSoftware", "getForceSoftware()Z", 1))};
        ub.p pVarD = ub.a.d(new g(0));
        f231b = pVarD;
        f232c = (hg.b) pVarD.getValue();
        ub.p pVarD2 = ub.a.d(new g(3));
        f233d = pVarD2;
        f234e = (hg.b) pVarD2.getValue();
        f235f = ub.a.d(new g(4));
        f236g = ub.a.d(new g(5));
        f237h = (hg.b) ub.a.d(new g(6)).getValue();
        f238i = ub.a.d(new g(7));
        f239j = ub.a.d(new g(8));
        f240k = ub.a.d(new g(9));
        f241l = ub.a.d(new g(10));
    }

    public static final MainApplication a() {
        return (MainApplication) f238i.getValue();
    }

    public static final h8.h b() {
        return (h8.h) f241l.getValue();
    }

    public static final AppDatabase c() {
        return (AppDatabase) f239j.getValue();
    }

    public static final fg.f d() {
        return (fg.f) f236g.getValue();
    }

    public static final fg.f e() {
        return (fg.f) f235f.getValue();
    }

    public static final String f() {
        return (String) f232c.c(f230a[0]);
    }
}
