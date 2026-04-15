package androidx.media3.exoplayer.offline;

import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.IBinder;
import b7.m2;
import com.cnl.kikoeru.MainApplication;
import com.cnl.kikoeru.MusicDownloadService;
import com.cnl.kikoeru.R;
import java.util.HashMap;
import java.util.List;
import p4.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class r extends Service {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final HashMap f958i = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f959a = new q(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f960b = "download_channel";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f961c = R.string.channel_name;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public DownloadService$DownloadManagerHelper f962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f963e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f964f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f965g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f966h;

    public static void a(r rVar, List list) {
        q qVar = rVar.f959a;
        if (qVar != null) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                int i11 = ((d) list.get(i10)).f893b;
                if (i11 == 2 || i11 == 5 || i11 == 7) {
                    qVar.f955b = true;
                    qVar.a();
                    return;
                }
            }
        }
    }

    public static void c(MainApplication mainApplication, o oVar) {
        mainApplication.startService(new Intent(mainApplication, (Class<?>) MusicDownloadService.class).setAction("androidx.media3.exoplayer.downloadService.action.ADD_DOWNLOAD").putExtra("foreground", false).putExtra("download_request", oVar).putExtra("stop_reason", 0));
    }

    public final void b() {
        q qVar = this.f959a;
        if (qVar != null) {
            qVar.f955b = false;
            qVar.f954a.removeCallbacksAndMessages(null);
        }
        DownloadService$DownloadManagerHelper downloadService$DownloadManagerHelper = this.f962d;
        downloadService$DownloadManagerHelper.getClass();
        if (downloadService$DownloadManagerHelper.j()) {
            if (c0.f16548a >= 28 || !this.f965g) {
                this.f966h |= stopSelfResult(this.f963e);
            } else {
                stopSelf();
                this.f966h = true;
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public final void onCreate() {
        String str = this.f960b;
        if (str != null && c0.f16548a >= 26) {
            NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
            notificationManager.getClass();
            p4.q.g();
            notificationManager.createNotificationChannel(p4.q.a(str, getString(this.f961c)));
        }
        Class<?> cls = getClass();
        HashMap map = f958i;
        final DownloadService$DownloadManagerHelper downloadService$DownloadManagerHelper = (DownloadService$DownloadManagerHelper) map.get(cls);
        if (downloadService$DownloadManagerHelper == null) {
            boolean z10 = this.f959a != null;
            i5.b bVar = (z10 && (c0.f16548a < 31)) ? new i5.b((MusicDownloadService) this) : null;
            m mVarA = h9.a.a();
            mVarA.f(false);
            DownloadService$DownloadManagerHelper downloadService$DownloadManagerHelper2 = new DownloadService$DownloadManagerHelper(getApplicationContext(), mVarA, z10, bVar, cls);
            map.put(cls, downloadService$DownloadManagerHelper2);
            downloadService$DownloadManagerHelper = downloadService$DownloadManagerHelper2;
        }
        this.f962d = downloadService$DownloadManagerHelper;
        p4.c.i(downloadService$DownloadManagerHelper.f866f == null);
        downloadService$DownloadManagerHelper.f866f = this;
        if (downloadService$DownloadManagerHelper.f862b.f937g) {
            c0.o(null).postAtFrontOfQueue(new Runnable() { // from class: androidx.media3.exoplayer.offline.p
                @Override // java.lang.Runnable
                public final void run() {
                    r.a(this, downloadService$DownloadManagerHelper.f862b.f941k);
                }
            });
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        DownloadService$DownloadManagerHelper downloadService$DownloadManagerHelper = this.f962d;
        downloadService$DownloadManagerHelper.getClass();
        p4.c.i(downloadService$DownloadManagerHelper.f866f == this);
        downloadService$DownloadManagerHelper.f866f = null;
        q qVar = this.f959a;
        if (qVar != null) {
            qVar.f955b = false;
            qVar.f954a.removeCallbacksAndMessages(null);
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        String action;
        String stringExtra;
        m mVar;
        j jVar;
        q qVar;
        this.f963e = i11;
        this.f965g = false;
        if (intent != null) {
            action = intent.getAction();
            stringExtra = intent.getStringExtra("content_id");
            this.f964f |= intent.getBooleanExtra("foreground", false) || "androidx.media3.exoplayer.downloadService.action.RESTART".equals(action);
        } else {
            action = null;
            stringExtra = null;
        }
        if (action == null) {
            action = "androidx.media3.exoplayer.downloadService.action.INIT";
        }
        DownloadService$DownloadManagerHelper downloadService$DownloadManagerHelper = this.f962d;
        downloadService$DownloadManagerHelper.getClass();
        mVar = downloadService$DownloadManagerHelper.f862b;
        jVar = mVar.f933c;
        switch (action) {
            case "androidx.media3.exoplayer.downloadService.action.SET_STOP_REASON":
                intent.getClass();
                if (intent.hasExtra("stop_reason")) {
                    int intExtra = intent.getIntExtra("stop_reason", 0);
                    mVar.f935e++;
                    jVar.obtainMessage(4, intExtra, 0, stringExtra).sendToTarget();
                    break;
                } else {
                    p4.c.n("DownloadService", "Ignored SET_STOP_REASON: Missing stop_reason extra");
                    break;
                }
                break;
            case "androidx.media3.exoplayer.downloadService.action.REMOVE_DOWNLOAD":
                if (stringExtra == null) {
                    p4.c.n("DownloadService", "Ignored REMOVE_DOWNLOAD: Missing content_id extra");
                    break;
                } else {
                    mVar.f935e++;
                    jVar.obtainMessage(8, stringExtra).sendToTarget();
                    break;
                }
                break;
            case "androidx.media3.exoplayer.downloadService.action.RESTART":
            case "androidx.media3.exoplayer.downloadService.action.INIT":
                break;
            case "androidx.media3.exoplayer.downloadService.action.RESUME_DOWNLOADS":
                mVar.f(false);
                break;
            case "androidx.media3.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS":
                mVar.f935e++;
                jVar.obtainMessage(9).sendToTarget();
                break;
            case "androidx.media3.exoplayer.downloadService.action.ADD_DOWNLOAD":
                intent.getClass();
                o oVar = (o) intent.getParcelableExtra("download_request");
                if (oVar == null) {
                    p4.c.n("DownloadService", "Ignored ADD_DOWNLOAD: Missing download_request extra");
                    break;
                } else {
                    int intExtra2 = intent.getIntExtra("stop_reason", 0);
                    mVar.f935e++;
                    jVar.obtainMessage(7, intExtra2, 0, oVar).sendToTarget();
                    break;
                }
                break;
            case "androidx.media3.exoplayer.downloadService.action.SET_REQUIREMENTS":
                intent.getClass();
                i5.c cVar = (i5.c) intent.getParcelableExtra("requirements");
                if (cVar == null) {
                    p4.c.n("DownloadService", "Ignored SET_REQUIREMENTS: Missing requirements extra");
                    break;
                } else {
                    if (!cVar.equals((i5.c) mVar.f942l.f9021e)) {
                        i5.f fVar = mVar.f942l;
                        Context context = (Context) fVar.f9019c;
                        m2 m2Var = (m2) fVar.f9023g;
                        m2Var.getClass();
                        context.unregisterReceiver(m2Var);
                        fVar.f9023g = null;
                        if (c0.f16548a >= 24 && ((i5.e) fVar.f9024h) != null) {
                            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                            connectivityManager.getClass();
                            i5.e eVar = (i5.e) fVar.f9024h;
                            eVar.getClass();
                            connectivityManager.unregisterNetworkCallback(eVar);
                            fVar.f9024h = null;
                        }
                        i5.f fVar2 = new i5.f(mVar.f931a, mVar.f934d, cVar);
                        mVar.f942l = fVar2;
                        mVar.d(mVar.f942l, fVar2.b());
                    }
                    break;
                }
                break;
            case "androidx.media3.exoplayer.downloadService.action.PAUSE_DOWNLOADS":
                mVar.f(true);
                break;
            default:
                p4.c.n("DownloadService", "Ignored unrecognized action: ".concat(action));
                break;
        }
        if (c0.f16548a >= 26 && this.f964f && (qVar = this.f959a) != null && !qVar.f956c) {
            qVar.a();
        }
        this.f966h = false;
        if (mVar.f936f == 0 && mVar.f935e == 0) {
            b();
        }
        return 1;
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        this.f965g = true;
    }
}
