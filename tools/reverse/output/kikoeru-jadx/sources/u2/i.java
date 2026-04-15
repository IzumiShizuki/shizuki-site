package u2;

import android.text.Layout;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Layout.Alignment f21245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Layout.Alignment f21246b;

    static {
        Layout.Alignment[] alignmentArrValues = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : alignmentArrValues) {
            if (jc.l.a(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (jc.l.a(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        f21245a = alignment;
        f21246b = alignment2;
    }
}
