package j5;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicLong f10444b = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10445a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u(s4.m mVar) {
        this(0L);
        Uri uri = mVar.f19443a;
        Map map = Collections.EMPTY_MAP;
    }

    public u(long j10) {
        this.f10445a = j10;
    }
}
