package n5;

import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f15326a;

    public d(int i10) {
        switch (i10) {
            case 1:
                this.f15326a = new CopyOnWriteArrayList();
                new HashMap();
                break;
            default:
                this.f15326a = new CopyOnWriteArrayList();
                break;
        }
    }
}
