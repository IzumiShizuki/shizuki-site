package ff;

import jc.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7078c;

    public g(int i10, String str, String str2) {
        this.f7076a = i10;
        switch (i10) {
            case 1:
                this.f7077b = str;
                this.f7078c = str2;
                break;
            default:
                l.e(str, "error");
                this.f7077b = str;
                this.f7078c = str2;
                break;
        }
    }

    @Override // ff.h
    public d toInstant() {
        throw new e(0, this.f7077b + " when parsing an Instant from \"" + f.o(64, this.f7078c) + '\"');
    }

    public String toString() {
        switch (this.f7076a) {
            case 1:
                return this.f7077b + ", " + this.f7078c;
            default:
                return super.toString();
        }
    }
}
