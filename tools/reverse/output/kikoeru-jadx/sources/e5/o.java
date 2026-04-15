package e5;

import androidx.media3.exoplayer.offline.t;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class o implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f6250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6251c;

    public o(String str, List list, boolean z10) {
        this.f6249a = str;
        this.f6250b = Collections.unmodifiableList(list);
        this.f6251c = z10;
    }
}
