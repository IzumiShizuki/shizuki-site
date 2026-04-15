package bg;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@sf.g
public final class e1 implements t {
    public static final x0 Companion = new x0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f2867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f2868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a1 f2870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2871e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f2872f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f2873g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f2874h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f2875i;

    public e1(int i10, Integer num, Integer num2, String str, a1 a1Var, int i11, int i12, int i13, int i14, int i15) {
        if (6 != (i10 & 6)) {
            wf.z0.i(i10, 6, w0.f2985b);
            throw null;
        }
        if ((i10 & 1) == 0) {
            this.f2867a = null;
        } else {
            this.f2867a = num;
        }
        this.f2868b = num2;
        this.f2869c = str;
        if ((i10 & 8) == 0) {
            this.f2870d = null;
        } else {
            this.f2870d = a1Var;
        }
        if ((i10 & 16) == 0) {
            this.f2871e = 0;
        } else {
            this.f2871e = i11;
        }
        if ((i10 & 32) == 0) {
            this.f2872f = 0;
        } else {
            this.f2872f = i12;
        }
        if ((i10 & 64) == 0) {
            this.f2873g = 0;
        } else {
            this.f2873g = i13;
        }
        if ((i10 & 128) == 0) {
            this.f2874h = 1;
        } else {
            this.f2874h = i14;
        }
        if ((i10 & 256) == 0) {
            this.f2875i = 0;
        } else {
            this.f2875i = i15;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        return jc.l.a(this.f2867a, e1Var.f2867a) && jc.l.a(this.f2868b, e1Var.f2868b) && jc.l.a(this.f2869c, e1Var.f2869c) && jc.l.a(this.f2870d, e1Var.f2870d) && this.f2871e == e1Var.f2871e && this.f2872f == e1Var.f2872f && this.f2873g == e1Var.f2873g && this.f2874h == e1Var.f2874h && this.f2875i == e1Var.f2875i;
    }

    @Override // bg.t
    public final String f() {
        return "tags/" + this.f2868b;
    }

    public final int hashCode() {
        Integer num = this.f2867a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f2868b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f2869c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        a1 a1Var = this.f2870d;
        return ((((((((((iHashCode3 + (a1Var != null ? a1Var.hashCode() : 0)) * 31) + this.f2871e) * 31) + this.f2872f) * 31) + this.f2873g) * 31) + this.f2874h) * 31) + this.f2875i;
    }

    @Override // bg.t
    public final String name() {
        String str = this.f2869c;
        return str == null ? "" : str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Tag(count=");
        sb.append(this.f2867a);
        sb.append(", id=");
        sb.append(this.f2868b);
        sb.append(", name=");
        sb.append(this.f2869c);
        sb.append(", i18n=");
        sb.append(this.f2870d);
        sb.append(", upvote=");
        sb.append(this.f2871e);
        sb.append(", downvote=");
        sb.append(this.f2872f);
        sb.append(", voteRank=");
        sb.append(this.f2873g);
        sb.append(", voteStatus=");
        sb.append(this.f2874h);
        sb.append(", myVote=");
        return j2.h0.m(sb, this.f2875i, ')');
    }
}
