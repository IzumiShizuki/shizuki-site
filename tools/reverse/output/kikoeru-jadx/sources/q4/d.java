package q4;

import com.tencent.bugly.beta.tinker.TinkerReport;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17712a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17713b;

    public /* synthetic */ d() {
    }

    public static String c(int i10) {
        return "" + ((char) ((i10 >> 24) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK)) + ((char) ((i10 >> 16) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK)) + ((char) ((i10 >> 8) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK)) + ((char) (i10 & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK));
    }

    public void b(int i10) {
        this.f17713b = i10 | this.f17713b;
    }

    public boolean d(int i10) {
        return (this.f17713b & i10) == i10;
    }

    public String toString() {
        switch (this.f17712a) {
            case 0:
                return c(this.f17713b);
            default:
                return super.toString();
        }
    }

    public d(int i10) {
        this.f17713b = i10;
    }
}
