.class public Lcom/tencent/bugly/beta/tinker/TinkerManager;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/bugly/beta/tinker/TinkerManager$TinkerListener;,
        Lcom/tencent/bugly/beta/tinker/TinkerManager$TinkerPatchResultListener;
    }
.end annotation


# static fields
.field public static final MF_FILE:Ljava/lang/String; = "YAPATCH.MF"

.field public static final PATCH_DIR:Ljava/lang/String; = "dex"

.field public static final PATCH_NAME:Ljava/lang/String; = "patch.apk"

.field private static final TAG:Ljava/lang/String; = "Tinker.TinkerManager"

.field public static apkOriginalBuildNum:Ljava/lang/String; = null

.field private static isInstalled:Z = false

.field public static patchCurBuildNum:Ljava/lang/String;

.field public static patchRestartOnScreenOff:Z

.field static patchResultListener:Lcom/tencent/bugly/beta/tinker/TinkerManager$TinkerPatchResultListener;

.field private static systemExceptionHandler:Ljava/lang/Thread$UncaughtExceptionHandler;

.field private static tinkerManager:Lcom/tencent/bugly/beta/tinker/TinkerManager;

.field public static tinkerReport:Lcom/tencent/bugly/beta/tinker/TinkerReport;

.field private static uncaughtExceptionHandler:Lcom/tencent/bugly/beta/tinker/TinkerUncaughtExceptionHandler;

.field static userLoadReporter:Lcom/tencent/tinker/lib/reporter/LoadReporter;

.field static userPatchListener:Lcom/tencent/tinker/lib/listener/PatchListener;

.field static userPatchReporter:Lcom/tencent/tinker/lib/reporter/PatchReporter;

.field static userUpgradePatchProcessor:Lcom/tencent/tinker/lib/patch/AbstractPatch;


# instance fields
.field private application:Landroid/app/Application;

.field private applicationLike:Lcom/tencent/tinker/entry/ApplicationLike;

.field private tinkerListener:Lcom/tencent/bugly/beta/tinker/TinkerManager$TinkerListener;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/tencent/bugly/beta/tinker/TinkerManager;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/tencent/bugly/beta/tinker/TinkerManager;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/tencent/bugly/beta/tinker/TinkerManager;->tinkerManager:Lcom/tencent/bugly/beta/tinker/TinkerManager;

    .line 7
    .line 8
    const-string v0, ""

    .line 9
    .line 10
    sput-object v0, Lcom/tencent/bugly/beta/tinker/TinkerManager;->apkOriginalBuildNum:Ljava/lang/String;

    .line 11
    .line 12
    sput-object v0, Lcom/tencent/bugly/beta/tinker/TinkerManager;->patchCurBuildNum:Ljava/lang/String;

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    sput-boolean v0, Lcom/tencent/bugly/beta/tinker/TinkerManager;->patchRestartOnScreenOff:Z

    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public static synthetic access$000(Lcom/tencent/bugly/beta/tinker/TinkerManager;)Lcom/tencent/bugly/beta/tinker/TinkerManager$TinkerListener;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/bugly/beta/tinker/TinkerManager;->tinkerListener:Lcom/tencent/bugly/beta/tinker/TinkerManager$TinkerListener;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public static getApplication()Landroid/app/Application;
    .locals 1

    .line 1
    invoke-static {}, Lcom/tencent/bugly/beta/tinker/TinkerManager;->getInstance()Lcom/tencent/bugly/beta/tinker/TinkerManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lcom/tencent/bugly/beta/tinker/TinkerManager;->application:Landroid/app/Application;

    .line 6
    .line 7
    return-object v0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public static getInstance()Lcom/tencent/bugly/beta/tinker/TinkerManager;
    .locals 1

    .line 1
    sget-object v0, Lcom/tencent/bugly/beta/tinker/TinkerManager;->tinkerManager:Lcom/tencent/bugly/beta/tinker/TinkerManager;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public static getNewTinkerId()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-static {}, Lcom/tencent/bugly/beta/tinker/TinkerManager;->getTinkerApplicationLike()Lcom/tencent/tinker/entry/ApplicationLike;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lcom/tencent/tinker/lib/tinker/TinkerApplicationHelper;->getPackageConfigs(Lcom/tencent/tinker/entry/ApplicationLike;)Ljava/util/HashMap;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, ""

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const-string v2, "NEW_TINKER_ID"

    .line 14
    .line 15
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v2, "tinker_id_"

    .line 24
    .line 25
    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    return-object v0

    .line 30
    :cond_0
    return-object v1
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
.end method

.method public static getTinkerApplicationLike()Lcom/tencent/tinker/entry/ApplicationLike;
    .locals 1

    .line 1
    invoke-static {}, Lcom/tencent/bugly/beta/tinker/TinkerManager;->getInstance()Lcom/tencent/bugly/beta/tinker/TinkerManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lcom/tencent/bugly/beta/tinker/TinkerManager;->applicationLike:Lcom/tencent/tinker/entry/ApplicationLike;

    .line 6
    .line 7
    return-object v0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public static getTinkerId()Ljava/lang/String;
    .locals 4

    .line 1
    invoke-static {}, Lcom/tencent/bugly/beta/tinker/TinkerManager;->getApplication()Landroid/app/Application;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lcom/tencent/tinker/lib/tinker/Tinker;->with(Landroid/content/Context;)Lcom/tencent/tinker/lib/tinker/Tinker;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lcom/tencent/tinker/lib/tinker/Tinker;->isTinkerLoaded()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const-string v1, "tinker_id_"

    .line 14
    .line 15
    const-string v2, ""

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-static {}, Lcom/tencent/bugly/beta/tinker/TinkerManager;->getTinkerApplicationLike()Lcom/tencent/tinker/entry/ApplicationLike;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, Lcom/tencent/tinker/lib/tinker/TinkerApplicationHelper;->getPackageConfigs(Lcom/tencent/tinker/entry/ApplicationLike;)Ljava/util/HashMap;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    const-string v3, "TINKER_ID"

    .line 30
    .line 31
    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    return-object v0

    .line 44
    :cond_0
    return-object v2

    .line 45
    :cond_1
    invoke-static {}, Lcom/tencent/bugly/beta/tinker/TinkerManager;->getApplication()Landroid/app/Application;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-static {v0}, Lcom/tencent/tinker/loader/shareutil/ShareTinkerInternals;->getManifestTinkerID(Landroid/content/Context;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-nez v3, :cond_2

    .line 58
    .line 59
    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    return-object v0

    .line 64
    :cond_2
    return-object v2
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
.end method

.method private static installDefaultTinker(Lcom/tencent/tinker/entry/ApplicationLike;)V
    .locals 8

    .line 1
    sget-boolean v0, Lcom/tencent/bugly/beta/tinker/TinkerManager;->isInstalled:Z

    .line 2
    .line 3
    const-string v1, "Tinker.TinkerManager"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    new-array p0, v2, [Ljava/lang/Object;

    .line 9
    .line 10
    const-string v0, "install tinker, but has installed, ignore"

    .line 11
    .line 12
    invoke-static {v1, v0, p0}, Lcom/tencent/tinker/lib/util/TinkerLog;->w(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    if-nez p0, :cond_1

    .line 17
    .line 18
    new-array p0, v2, [Ljava/lang/Object;

    .line 19
    .line 20
    const-string v0, "Tinker ApplicationLike is null"

    .line 21
    .line 22
    invoke-static {v1, v0, p0}, Lcom/tencent/tinker/lib/util/TinkerLog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    invoke-static {}, Lcom/tencent/bugly/beta/tinker/TinkerManager;->getInstance()Lcom/tencent/bugly/beta/tinker/TinkerManager;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-direct {v0, p0}, Lcom/tencent/bugly/beta/tinker/TinkerManager;->setTinkerApplicationLike(Lcom/tencent/tinker/entry/ApplicationLike;)V

    .line 31
    .line 32
    .line 33
    invoke-static {}, Lcom/tencent/bugly/beta/tinker/TinkerManager;->registJavaCrashHandler()V

    .line 34
    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    invoke-static {v0}, Lcom/tencent/bugly/beta/tinker/TinkerManager;->setUpgradeRetryEnable(Z)V

    .line 38
    .line 39
    .line 40
    new-instance v1, Lcom/tencent/bugly/beta/tinker/TinkerReport;

    .line 41
    .line 42
    invoke-direct {v1}, Lcom/tencent/bugly/beta/tinker/TinkerReport;-><init>()V

    .line 43
    .line 44
    .line 45
    sput-object v1, Lcom/tencent/bugly/beta/tinker/TinkerManager;->tinkerReport:Lcom/tencent/bugly/beta/tinker/TinkerReport;

    .line 46
    .line 47
    new-instance v1, Lcom/tencent/bugly/beta/tinker/TinkerLogger;

    .line 48
    .line 49
    invoke-direct {v1}, Lcom/tencent/bugly/beta/tinker/TinkerLogger;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-static {v1}, Lcom/tencent/tinker/lib/util/TinkerLog;->setTinkerLogImp(Lcom/tencent/tinker/lib/util/TinkerLog$TinkerLogImp;)V

    .line 53
    .line 54
    .line 55
    new-instance v3, Lcom/tencent/bugly/beta/tinker/TinkerLoadReporter;

    .line 56
    .line 57
    invoke-virtual {p0}, Lcom/tencent/tinker/entry/ApplicationLike;->getApplication()Landroid/app/Application;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-direct {v3, v1}, Lcom/tencent/bugly/beta/tinker/TinkerLoadReporter;-><init>(Landroid/content/Context;)V

    .line 62
    .line 63
    .line 64
    new-instance v4, Lcom/tencent/bugly/beta/tinker/TinkerPatchReporter;

    .line 65
    .line 66
    invoke-virtual {p0}, Lcom/tencent/tinker/entry/ApplicationLike;->getApplication()Landroid/app/Application;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-direct {v4, v1}, Lcom/tencent/bugly/beta/tinker/TinkerPatchReporter;-><init>(Landroid/content/Context;)V

    .line 71
    .line 72
    .line 73
    new-instance v5, Lcom/tencent/bugly/beta/tinker/TinkerPatchListener;

    .line 74
    .line 75
    invoke-virtual {p0}, Lcom/tencent/tinker/entry/ApplicationLike;->getApplication()Landroid/app/Application;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-direct {v5, v1}, Lcom/tencent/bugly/beta/tinker/TinkerPatchListener;-><init>(Landroid/content/Context;)V

    .line 80
    .line 81
    .line 82
    new-instance v7, Lcom/tencent/tinker/lib/patch/UpgradePatch;

    .line 83
    .line 84
    invoke-direct {v7}, Lcom/tencent/tinker/lib/patch/UpgradePatch;-><init>()V

    .line 85
    .line 86
    .line 87
    const-class v6, Lcom/tencent/bugly/beta/tinker/TinkerResultService;

    .line 88
    .line 89
    move-object v2, p0

    .line 90
    invoke-static/range {v2 .. v7}, Lcom/tencent/tinker/lib/tinker/TinkerInstaller;->install(Lcom/tencent/tinker/entry/ApplicationLike;Lcom/tencent/tinker/lib/reporter/LoadReporter;Lcom/tencent/tinker/lib/reporter/PatchReporter;Lcom/tencent/tinker/lib/listener/PatchListener;Ljava/lang/Class;Lcom/tencent/tinker/lib/patch/AbstractPatch;)Lcom/tencent/tinker/lib/tinker/Tinker;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    if-eqz p0, :cond_2

    .line 95
    .line 96
    sput-boolean v0, Lcom/tencent/bugly/beta/tinker/TinkerManager;->isInstalled:Z

    .line 97
    .line 98
    :cond_2
    return-void
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method

.method public static installTinker(Ljava/lang/Object;)V
    .locals 3

    const-string v0, "Tinker.TinkerManager"

    const/4 v1, 0x0

    if-nez p0, :cond_0

    .line 1
    new-array p0, v1, [Ljava/lang/Object;

    const-string v1, "Tinker ApplicationLike is null"

    invoke-static {v0, v1, p0}, Lcom/tencent/tinker/lib/util/TinkerLog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 2
    :cond_0
    instance-of v2, p0, Lcom/tencent/tinker/entry/ApplicationLike;

    if-eqz v2, :cond_1

    .line 3
    check-cast p0, Lcom/tencent/tinker/entry/ApplicationLike;

    invoke-static {p0}, Lcom/tencent/bugly/beta/tinker/TinkerManager;->installDefaultTinker(Lcom/tencent/tinker/entry/ApplicationLike;)V

    return-void

    .line 4
    :cond_1
    new-array p0, v1, [Ljava/lang/Object;

    const-string v1, "NOT tinker ApplicationLike object"

    invoke-static {v0, v1, p0}, Lcom/tencent/tinker/lib/util/TinkerLog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public static installTinker(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lcom/tencent/bugly/beta/tinker/TinkerManager$TinkerPatchResultListener;Ljava/lang/Object;)V
    .locals 3

    const-string v0, "Tinker.TinkerManager"

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    .line 5
    instance-of v2, p1, Lcom/tencent/tinker/lib/reporter/LoadReporter;

    if-eqz v2, :cond_0

    .line 6
    check-cast p1, Lcom/tencent/tinker/lib/reporter/LoadReporter;

    sput-object p1, Lcom/tencent/bugly/beta/tinker/TinkerManager;->userLoadReporter:Lcom/tencent/tinker/lib/reporter/LoadReporter;

    goto :goto_0

    .line 7
    :cond_0
    new-array p0, v1, [Ljava/lang/Object;

    const-string p1, "NOT LoadReporter object"

    invoke-static {v0, p1, p0}, Lcom/tencent/tinker/lib/util/TinkerLog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_1
    :goto_0
    if-eqz p2, :cond_3

    .line 8
    instance-of p1, p2, Lcom/tencent/tinker/lib/reporter/PatchReporter;

    if-eqz p1, :cond_2

    .line 9
    check-cast p2, Lcom/tencent/tinker/lib/reporter/PatchReporter;

    sput-object p2, Lcom/tencent/bugly/beta/tinker/TinkerManager;->userPatchReporter:Lcom/tencent/tinker/lib/reporter/PatchReporter;

    goto :goto_1

    .line 10
    :cond_2
    new-array p0, v1, [Ljava/lang/Object;

    const-string p1, "NOT PatchReporter object"

    invoke-static {v0, p1, p0}, Lcom/tencent/tinker/lib/util/TinkerLog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_3
    :goto_1
    if-eqz p3, :cond_5

    .line 11
    instance-of p1, p3, Lcom/tencent/tinker/lib/listener/PatchListener;

    if-eqz p1, :cond_4

    .line 12
    check-cast p3, Lcom/tencent/tinker/lib/listener/PatchListener;

    sput-object p3, Lcom/tencent/bugly/beta/tinker/TinkerManager;->userPatchListener:Lcom/tencent/tinker/lib/listener/PatchListener;

    goto :goto_2

    .line 13
    :cond_4
    new-array p0, v1, [Ljava/lang/Object;

    const-string p1, "NOT PatchListener object"

    invoke-static {v0, p1, p0}, Lcom/tencent/tinker/lib/util/TinkerLog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_5
    :goto_2
    if-eqz p4, :cond_6

    .line 14
    sput-object p4, Lcom/tencent/bugly/beta/tinker/TinkerManager;->patchResultListener:Lcom/tencent/bugly/beta/tinker/TinkerManager$TinkerPatchResultListener;

    :cond_6
    if-eqz p5, :cond_8

    .line 15
    instance-of p1, p5, Lcom/tencent/tinker/lib/patch/AbstractPatch;

    if-eqz p1, :cond_7

    .line 16
    check-cast p5, Lcom/tencent/tinker/lib/patch/AbstractPatch;

    sput-object p5, Lcom/tencent/bugly/beta/tinker/TinkerManager;->userUpgradePatchProcessor:Lcom/tencent/tinker/lib/patch/AbstractPatch;

    goto :goto_3

    .line 17
    :cond_7
    new-array p0, v1, [Ljava/lang/Object;

    const-string p1, "NOT AbstractPatch object"

    invoke-static {v0, p1, p0}, Lcom/tencent/tinker/lib/util/TinkerLog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 18
    :cond_8
    :goto_3
    invoke-static {p0}, Lcom/tencent/bugly/beta/tinker/TinkerManager;->installTinker(Ljava/lang/Object;)V

    return-void
.end method

.method public static isPatchRestartOnScreenOff()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/tencent/bugly/beta/tinker/TinkerManager;->patchRestartOnScreenOff:Z

    .line 2
    .line 3
    return v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public static isTinkerManagerInstalled()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/tencent/bugly/beta/tinker/TinkerManager;->isInstalled:Z

    .line 2
    .line 3
    return v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public static loadArmLibrary(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/tencent/tinker/lib/library/TinkerLoadLibrary;->loadArmLibrary(Landroid/content/Context;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
.end method

.method public static loadArmV7Library(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/tencent/tinker/lib/library/TinkerLoadLibrary;->loadArmV7Library(Landroid/content/Context;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
.end method

.method public static loadLibraryFromTinker(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/tencent/tinker/lib/library/TinkerLoadLibrary;->loadLibraryFromTinker(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method

.method public static registJavaCrashHandler()V
    .locals 1

    .line 1
    sget-object v0, Lcom/tencent/bugly/beta/tinker/TinkerManager;->uncaughtExceptionHandler:Lcom/tencent/bugly/beta/tinker/TinkerUncaughtExceptionHandler;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lcom/tencent/bugly/beta/tinker/TinkerManager;->systemExceptionHandler:Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 10
    .line 11
    new-instance v0, Lcom/tencent/bugly/beta/tinker/TinkerUncaughtExceptionHandler;

    .line 12
    .line 13
    invoke-direct {v0}, Lcom/tencent/bugly/beta/tinker/TinkerUncaughtExceptionHandler;-><init>()V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lcom/tencent/bugly/beta/tinker/TinkerManager;->uncaughtExceptionHandler:Lcom/tencent/bugly/beta/tinker/TinkerUncaughtExceptionHandler;

    .line 17
    .line 18
    invoke-static {v0}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public static setPatchRestartOnScreenOff(Z)V
    .locals 0

    .line 1
    sput-boolean p0, Lcom/tencent/bugly/beta/tinker/TinkerManager;->patchRestartOnScreenOff:Z

    .line 2
    .line 3
    return-void
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method private setTinkerApplicationLike(Lcom/tencent/tinker/entry/ApplicationLike;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tencent/bugly/beta/tinker/TinkerManager;->applicationLike:Lcom/tencent/tinker/entry/ApplicationLike;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/tencent/tinker/entry/ApplicationLike;->getApplication()Landroid/app/Application;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, Lcom/tencent/bugly/beta/tinker/TinkerManager;->application:Landroid/app/Application;

    .line 10
    .line 11
    :cond_0
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public static setUpgradeRetryEnable(Z)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/tencent/bugly/beta/tinker/TinkerManager;->getTinkerApplicationLike()Lcom/tencent/tinker/entry/ApplicationLike;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/tencent/tinker/entry/ApplicationLike;->getApplication()Landroid/app/Application;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lcom/tencent/tinker/lib/util/UpgradePatchRetry;->getInstance(Landroid/content/Context;)Lcom/tencent/tinker/lib/util/UpgradePatchRetry;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0, p0}, Lcom/tencent/tinker/lib/util/UpgradePatchRetry;->setRetryEnable(Z)V

    .line 14
    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public static unregistJavaCrashHandler()V
    .locals 1

    .line 1
    sget-object v0, Lcom/tencent/bugly/beta/tinker/TinkerManager;->systemExceptionHandler:Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method


# virtual methods
.method public applyPatch(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-boolean v0, Lcom/tencent/bugly/beta/tinker/TinkerManager;->isInstalled:Z

    if-nez v0, :cond_0

    const/4 p1, 0x0

    .line 2
    new-array p1, p1, [Ljava/lang/Object;

    const-string p2, "Tinker.TinkerManager"

    const-string v0, "Tinker has not been installed."

    invoke-static {p2, v0, p1}, Lcom/tencent/tinker/lib/util/TinkerLog;->w(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/beta/tinker/TinkerManager;->tinkerListener:Lcom/tencent/bugly/beta/tinker/TinkerManager$TinkerListener;

    if-eqz v0, :cond_1

    .line 4
    invoke-interface {v0}, Lcom/tencent/bugly/beta/tinker/TinkerManager$TinkerListener;->onPatchStart()V

    .line 5
    :cond_1
    invoke-static {p1, p2}, Lcom/tencent/tinker/lib/tinker/TinkerInstaller;->onReceiveUpgradePatch(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public applyPatch(Ljava/lang/String;Z)V
    .locals 5

    const-string v0, "Tinker.TinkerManager"

    const/4 v1, 0x0

    .line 6
    :try_start_0
    iget-object v2, p0, Lcom/tencent/bugly/beta/tinker/TinkerManager;->applicationLike:Lcom/tencent/tinker/entry/ApplicationLike;

    invoke-virtual {v2}, Lcom/tencent/tinker/entry/ApplicationLike;->getApplication()Landroid/app/Application;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v3, "dex"

    .line 7
    :try_start_1
    invoke-virtual {v2, v3, v1}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    .line 8
    new-instance v3, Ljava/io/File;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    const-string v4, "patch.apk"

    :try_start_2
    invoke-direct {v3, v2, v4}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/beta/tinker/TinkerManager;->checkNewPatch(Ljava/lang/String;)Z

    move-result v2
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    if-eqz v2, :cond_0

    const-string v2, "has new patch."

    .line 10
    :try_start_3
    new-array v4, v1, [Ljava/lang/Object;

    invoke-static {v0, v2, v4}, Lcom/tencent/tinker/lib/util/TinkerLog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 11
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 12
    invoke-static {v2, v3}, Lcom/tencent/bugly/beta/tinker/TinkerUtils;->copy(Ljava/io/File;Ljava/io/File;)Z

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    .line 13
    :goto_0
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result p1
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    if-nez p1, :cond_1

    const-string p1, "patch not exist, just return."

    .line 14
    :try_start_4
    new-array p2, v1, [Ljava/lang/Object;

    invoke-static {v0, p1, p2}, Lcom/tencent/tinker/lib/util/TinkerLog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    return-void

    :cond_1
    if-eqz v2, :cond_2

    if-eqz p2, :cond_2

    const-string p1, "starting patch."

    .line 15
    :try_start_5
    new-array p2, v1, [Ljava/lang/Object;

    invoke-static {v0, p1, p2}, Lcom/tencent/tinker/lib/util/TinkerLog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 16
    iget-object p1, p0, Lcom/tencent/bugly/beta/tinker/TinkerManager;->applicationLike:Lcom/tencent/tinker/entry/ApplicationLike;

    invoke-virtual {p1}, Lcom/tencent/tinker/entry/ApplicationLike;->getApplication()Landroid/app/Application;

    move-result-object p1

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/beta/tinker/TinkerManager;->applyPatch(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    :cond_2
    return-void

    .line 17
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    new-array p2, v1, [Ljava/lang/Object;

    invoke-static {v0, p1, p2}, Lcom/tencent/tinker/lib/util/TinkerLog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public checkNewPatch(Ljava/lang/String;)Z
    .locals 6

    .line 1
    const-string v0, "To"

    .line 2
    .line 3
    const-string v1, "From"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    new-array v3, v2, [Ljava/lang/Object;

    .line 7
    .line 8
    const-string v4, "check if has new patch."

    .line 9
    .line 10
    const-string v5, "Tinker.TinkerManager"

    .line 11
    .line 12
    invoke-static {v5, v4, v3}, Lcom/tencent/tinker/lib/util/TinkerLog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lcom/tencent/bugly/beta/tinker/TinkerManager;->getTinkerId()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    sput-object v3, Lcom/tencent/bugly/beta/tinker/TinkerManager;->apkOriginalBuildNum:Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {}, Lcom/tencent/bugly/beta/tinker/TinkerManager;->getNewTinkerId()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    sput-object v3, Lcom/tencent/bugly/beta/tinker/TinkerManager;->patchCurBuildNum:Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    const/4 v4, 0x1

    .line 32
    if-eqz v3, :cond_0

    .line 33
    .line 34
    const/4 p1, 0x0

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    new-instance v3, Ljava/io/File;

    .line 37
    .line 38
    invoke-direct {v3, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-nez p1, :cond_1

    .line 46
    .line 47
    move-object p1, v3

    .line 48
    :goto_0
    move-object v3, p1

    .line 49
    const/4 p1, 0x0

    .line 50
    goto :goto_1

    .line 51
    :cond_1
    const/4 p1, 0x1

    .line 52
    :goto_1
    if-eqz p1, :cond_7

    .line 53
    .line 54
    const-string p1, "YAPATCH.MF"

    .line 55
    .line 56
    invoke-static {v3, p1}, Lcom/tencent/bugly/beta/tinker/TinkerUtils;->readJarEntry(Ljava/io/File;Ljava/lang/String;)[B

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    if-nez p1, :cond_2

    .line 61
    .line 62
    return v2

    .line 63
    :cond_2
    new-instance v3, Ljava/io/ByteArrayInputStream;

    .line 64
    .line 65
    invoke-direct {v3, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 66
    .line 67
    .line 68
    :try_start_0
    new-instance p1, Ljava/util/Properties;

    .line 69
    .line 70
    invoke-direct {p1}, Ljava/util/Properties;-><init>()V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1, v3}, Ljava/util/Properties;->load(Ljava/io/InputStream;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    if-eqz v3, :cond_6

    .line 81
    .line 82
    invoke-virtual {p1, v0}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    if-nez v3, :cond_3

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_3
    sget-object v3, Lcom/tencent/bugly/beta/tinker/TinkerManager;->apkOriginalBuildNum:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 90
    .line 91
    if-nez v3, :cond_4

    .line 92
    .line 93
    const-string p1, "patchCurBuildNum is null"

    .line 94
    .line 95
    :try_start_1
    new-array v0, v2, [Ljava/lang/Object;

    .line 96
    .line 97
    invoke-static {v5, p1, v0}, Lcom/tencent/tinker/lib/util/TinkerLog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    return v2

    .line 101
    :cond_4
    invoke-virtual {p1, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-virtual {v3, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    if-eqz v1, :cond_5

    .line 110
    .line 111
    invoke-virtual {p1, v0}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    sput-object p1, Lcom/tencent/bugly/beta/tinker/TinkerManager;->patchCurBuildNum:Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 116
    .line 117
    return v4

    .line 118
    :cond_5
    const-string p1, "orign buildno invalid"

    .line 119
    .line 120
    :try_start_2
    new-array v0, v2, [Ljava/lang/Object;

    .line 121
    .line 122
    invoke-static {v5, p1, v0}, Lcom/tencent/tinker/lib/util/TinkerLog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 123
    .line 124
    .line 125
    return v2

    .line 126
    :cond_6
    :goto_2
    const-string p1, "From/To is null"

    .line 127
    .line 128
    :try_start_3
    new-array v0, v2, [Ljava/lang/Object;

    .line 129
    .line 130
    invoke-static {v5, p1, v0}, Lcom/tencent/tinker/lib/util/TinkerLog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 131
    .line 132
    .line 133
    return v2

    .line 134
    :catch_0
    new-array p1, v2, [Ljava/lang/Object;

    .line 135
    .line 136
    const-string v0, "get properties failed"

    .line 137
    .line 138
    invoke-static {v5, v0, p1}, Lcom/tencent/tinker/lib/util/TinkerLog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    return v2

    .line 142
    :cond_7
    return p1
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
.end method

.method public cleanPatch(Z)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/beta/tinker/TinkerManager;->onPatchRollback(Z)V

    .line 2
    .line 3
    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public getPatchDirectory(Landroid/content/Context;)Ljava/io/File;
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/tencent/tinker/loader/shareutil/SharePatchFileUtil;->getPatchDirectory(Landroid/content/Context;)Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public getTinkerListener()Lcom/tencent/bugly/beta/tinker/TinkerManager$TinkerListener;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/bugly/beta/tinker/TinkerManager;->tinkerListener:Lcom/tencent/bugly/beta/tinker/TinkerManager$TinkerListener;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public onApplyFailure(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/bugly/beta/tinker/TinkerManager;->tinkerListener:Lcom/tencent/bugly/beta/tinker/TinkerManager$TinkerListener;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lcom/tencent/bugly/beta/tinker/TinkerManager$TinkerListener;->onApplyFailure(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public onApplySuccess(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/bugly/beta/tinker/TinkerManager;->tinkerListener:Lcom/tencent/bugly/beta/tinker/TinkerManager$TinkerListener;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lcom/tencent/bugly/beta/tinker/TinkerManager$TinkerListener;->onApplySuccess(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public onDownloadFailure(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/bugly/beta/tinker/TinkerManager;->tinkerListener:Lcom/tencent/bugly/beta/tinker/TinkerManager$TinkerListener;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lcom/tencent/bugly/beta/tinker/TinkerManager$TinkerListener;->onDownloadFailure(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public onDownloadSuccess(Ljava/lang/String;Z)V
    .locals 4

    .line 1
    const-string v0, "Tinker.TinkerManager"

    .line 2
    .line 3
    const-string v1, "onDownloadSuccess."

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    :try_start_0
    new-array v3, v2, [Ljava/lang/Object;

    .line 7
    .line 8
    invoke-static {v0, v1, v3}, Lcom/tencent/tinker/lib/util/TinkerLog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lcom/tencent/bugly/beta/tinker/TinkerManager;->tinkerListener:Lcom/tencent/bugly/beta/tinker/TinkerManager$TinkerListener;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-interface {v1, p1}, Lcom/tencent/bugly/beta/tinker/TinkerManager$TinkerListener;->onDownloadSuccess(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/beta/tinker/TinkerManager;->applyPatch(Ljava/lang/String;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :catch_0
    new-array p1, v2, [Ljava/lang/Object;

    .line 23
    .line 24
    const-string p2, "apply patch failed"

    .line 25
    .line 26
    invoke-static {v0, p2, p1}, Lcom/tencent/tinker/lib/util/TinkerLog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-void
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
.end method

.method public onPatchRollback(Z)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/tencent/bugly/beta/tinker/TinkerManager;->getApplication()Landroid/app/Application;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lcom/tencent/tinker/lib/tinker/Tinker;->with(Landroid/content/Context;)Lcom/tencent/tinker/lib/tinker/Tinker;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lcom/tencent/tinker/lib/tinker/Tinker;->isTinkerLoaded()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    new-array p1, v1, [Ljava/lang/Object;

    .line 17
    .line 18
    const-string v0, "Tinker.PatchRequestCallback"

    .line 19
    .line 20
    const-string v1, "TinkerPatchRequestCallback: onPatchRollback, tinker is not loaded, just return"

    .line 21
    .line 22
    invoke-static {v0, v1, p1}, Lcom/tencent/tinker/lib/util/TinkerLog;->w(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    const-string v0, "Tinker.TinkerManager"

    .line 27
    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    new-array p1, v1, [Ljava/lang/Object;

    .line 31
    .line 32
    const-string v1, "delete patch now"

    .line 33
    .line 34
    invoke-static {v0, v1, p1}, Lcom/tencent/tinker/lib/util/TinkerLog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-static {}, Lcom/tencent/bugly/beta/tinker/TinkerManager;->getApplication()Landroid/app/Application;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-static {p1}, Lcom/tencent/bugly/beta/tinker/TinkerUtils;->rollbackPatch(Landroid/content/Context;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    new-array p1, v1, [Ljava/lang/Object;

    .line 46
    .line 47
    const-string v1, "tinker wait screen to restart process"

    .line 48
    .line 49
    invoke-static {v0, v1, p1}, Lcom/tencent/tinker/lib/util/TinkerLog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    new-instance p1, Lcom/tencent/bugly/beta/tinker/TinkerUtils$ScreenState;

    .line 53
    .line 54
    invoke-static {}, Lcom/tencent/bugly/beta/tinker/TinkerManager;->getApplication()Landroid/app/Application;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    new-instance v1, Lcom/tencent/bugly/beta/tinker/b;

    .line 59
    .line 60
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 61
    .line 62
    .line 63
    invoke-direct {p1, v0, v1}, Lcom/tencent/bugly/beta/tinker/TinkerUtils$ScreenState;-><init>(Landroid/content/Context;Lcom/tencent/bugly/beta/tinker/g;)V

    .line 64
    .line 65
    .line 66
    :goto_0
    new-instance p1, Landroid/os/Handler;

    .line 67
    .line 68
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 73
    .line 74
    .line 75
    new-instance v0, Lcom/tencent/bugly/beta/tinker/c;

    .line 76
    .line 77
    invoke-direct {v0, p0}, Lcom/tencent/bugly/beta/tinker/c;-><init>(Lcom/tencent/bugly/beta/tinker/TinkerManager;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 81
    .line 82
    .line 83
    return-void
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method

.method public setTinkerListener(Lcom/tencent/bugly/beta/tinker/TinkerManager$TinkerListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tencent/bugly/beta/tinker/TinkerManager;->tinkerListener:Lcom/tencent/bugly/beta/tinker/TinkerManager$TinkerListener;

    .line 2
    .line 3
    return-void
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public setTinkerReport(Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/tencent/bugly/beta/tinker/TinkerManager;->tinkerReport:Lcom/tencent/bugly/beta/tinker/TinkerReport;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/tencent/bugly/beta/tinker/TinkerReport;->setReporter(Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method
