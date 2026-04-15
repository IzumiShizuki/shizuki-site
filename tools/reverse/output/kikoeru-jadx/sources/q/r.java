package q;

import com.tencent.bugly.beta.tinker.TinkerReport;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r extends jc.m implements ic.k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f17423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r f17424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final r f17425e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final r f17426f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final r f17427g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final r f17428h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final r f17429i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final r f17430j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final r f17431k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final r f17432l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17433b;

    static {
        int i10 = 1;
        f17423c = new r(i10, 0);
        f17424d = new r(i10, 1);
        f17425e = new r(i10, 2);
        f17426f = new r(i10, 3);
        f17427g = new r(i10, 4);
        f17428h = new r(i10, 5);
        f17429i = new r(i10, 6);
        f17430j = new r(i10, 7);
        f17431k = new r(i10, 8);
        f17432l = new r(i10, 9);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i10, int i11) {
        super(i10);
        this.f17433b = i11;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f17433b) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                break;
            case 1:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                break;
            case 2:
                long jA = q1.q.a(((q1.q) obj).f17577a, r1.d.f18676x);
                break;
            case 4:
                long j10 = ((q1.p0) obj).f17568a;
                break;
            case 5:
                r.m mVar = (r.m) obj;
                break;
            case 6:
                break;
            case 7:
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                ((ic.a) obj).b();
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                break;
        }
        return new f3.l((((long) ((int) (((f3.l) obj).f6666a >> 32))) << 32) | (((long) 0) & 4294967295L));
    }
}
