package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import n7.l;
import n7.m;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/room/MultiInstanceInvalidationService;", "Landroid/app/Service;", "<init>", "()V", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MultiInstanceInvalidationService extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f1068b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f1069c = new m(this);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f1070d = new l(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        jc.l.e(intent, "intent");
        return this.f1070d;
    }
}
