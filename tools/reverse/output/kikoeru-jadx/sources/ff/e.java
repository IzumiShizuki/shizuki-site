package ff;

import jc.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e extends IllegalArgumentException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i10, String str) {
        super(str);
        switch (i10) {
            case 1:
                l.e(str, "message");
                super(str, null);
                break;
            case 2:
                l.e(str, "msg");
                super(str);
                break;
            default:
                l.e(str, "message");
                break;
        }
    }
}
