.class public Lcom/tencent/bugly/crashreport/common/strategy/c;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static a:I = 0x3e8

.field private static b:Lcom/tencent/bugly/crashreport/common/strategy/c;

.field private static c:Ljava/lang/String;


# instance fields
.field private final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/tencent/bugly/a;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lcom/tencent/bugly/proguard/W;

.field private final f:Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

.field private g:Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

.field private h:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lcom/tencent/bugly/a;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/tencent/bugly/crashreport/common/strategy/c;->g:Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    .line 6
    .line 7
    iput-object p1, p0, Lcom/tencent/bugly/crashreport/common/strategy/c;->h:Landroid/content/Context;

    .line 8
    .line 9
    invoke-static {p1}, Lcom/tencent/bugly/crashreport/common/strategy/c;->a(Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    new-instance p1, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    .line 13
    .line 14
    invoke-direct {p1}, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lcom/tencent/bugly/crashreport/common/strategy/c;->f:Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    .line 18
    .line 19
    iput-object p2, p0, Lcom/tencent/bugly/crashreport/common/strategy/c;->d:Ljava/util/List;

    .line 20
    .line 21
    invoke-static {}, Lcom/tencent/bugly/proguard/W;->c()Lcom/tencent/bugly/proguard/W;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iput-object p1, p0, Lcom/tencent/bugly/crashreport/common/strategy/c;->e:Lcom/tencent/bugly/proguard/W;

    .line 26
    .line 27
    return-void
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

.method public static synthetic a(Lcom/tencent/bugly/crashreport/common/strategy/c;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/bugly/crashreport/common/strategy/c;->h:Landroid/content/Context;

    return-object p0
.end method

.method public static synthetic a(Lcom/tencent/bugly/crashreport/common/strategy/c;Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;)Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/tencent/bugly/crashreport/common/strategy/c;->g:Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    return-object p1
.end method

.method public static declared-synchronized a(Landroid/content/Context;Ljava/util/List;)Lcom/tencent/bugly/crashreport/common/strategy/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lcom/tencent/bugly/a;",
            ">;)",
            "Lcom/tencent/bugly/crashreport/common/strategy/c;"
        }
    .end annotation

    const-class v0, Lcom/tencent/bugly/crashreport/common/strategy/c;

    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/crashreport/common/strategy/c;->b:Lcom/tencent/bugly/crashreport/common/strategy/c;

    if-nez v1, :cond_0

    .line 5
    new-instance v1, Lcom/tencent/bugly/crashreport/common/strategy/c;

    invoke-direct {v1, p0, p1}, Lcom/tencent/bugly/crashreport/common/strategy/c;-><init>(Landroid/content/Context;Ljava/util/List;)V

    sput-object v1, Lcom/tencent/bugly/crashreport/common/strategy/c;->b:Lcom/tencent/bugly/crashreport/common/strategy/c;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    .line 6
    :cond_0
    :goto_0
    sget-object p0, Lcom/tencent/bugly/crashreport/common/strategy/c;->b:Lcom/tencent/bugly/crashreport/common/strategy/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static synthetic a()Ljava/lang/String;
    .locals 1

    .line 3
    sget-object v0, Lcom/tencent/bugly/crashreport/common/strategy/c;->c:Ljava/lang/String;

    return-object v0
.end method

.method private static a(Landroid/content/Context;)V
    .locals 1

    .line 77
    invoke-static {p0}, Lcom/tencent/bugly/crashreport/common/info/a;->a(Landroid/content/Context;)Lcom/tencent/bugly/crashreport/common/info/a;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 78
    invoke-static {p0}, Lcom/tencent/bugly/crashreport/common/info/a;->a(Landroid/content/Context;)Lcom/tencent/bugly/crashreport/common/info/a;

    move-result-object p0

    iget-object p0, p0, Lcom/tencent/bugly/crashreport/common/info/a;->fa:Ljava/lang/String;

    const-string v0, "oversea"

    .line 79
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 80
    const-string p0, "https://astat.bugly.qcloud.com/rqd/async"

    sput-object p0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->a:Ljava/lang/String;

    .line 81
    sput-object p0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->b:Ljava/lang/String;

    return-void

    :cond_0
    const-string v0, "na_https"

    .line 82
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    .line 83
    const-string p0, "https://astat.bugly.cros.wr.pvp.net/:8180/rqd/async"

    sput-object p0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->a:Ljava/lang/String;

    .line 84
    sput-object p0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->b:Ljava/lang/String;

    :cond_1
    return-void
.end method

.method public static a(Ljava/lang/String;)V
    .locals 1

    .line 15
    invoke-static {p0}, Lcom/tencent/bugly/proguard/ca;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p0}, Lcom/tencent/bugly/proguard/ca;->c(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 16
    :cond_0
    sput-object p0, Lcom/tencent/bugly/crashreport/common/strategy/c;->c:Ljava/lang/String;

    return-void

    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 17
    new-array p0, p0, [Ljava/lang/Object;

    const-string v0, "URL user set is invalid."

    invoke-static {v0, p0}, Lcom/tencent/bugly/proguard/X;->e(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void
.end method

.method public static synthetic b(Lcom/tencent/bugly/crashreport/common/strategy/c;)Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/bugly/crashreport/common/strategy/c;->g:Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    return-object p0
.end method

.method public static declared-synchronized b()Lcom/tencent/bugly/crashreport/common/strategy/c;
    .locals 2

    const-class v0, Lcom/tencent/bugly/crashreport/common/strategy/c;

    monitor-enter v0

    .line 2
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/crashreport/common/strategy/c;->b:Lcom/tencent/bugly/crashreport/common/strategy/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method


# virtual methods
.method public a(J)V
    .locals 3

    .line 7
    iget-object v0, p0, Lcom/tencent/bugly/crashreport/common/strategy/c;->e:Lcom/tencent/bugly/proguard/W;

    new-instance v1, Lcom/tencent/bugly/crashreport/crash/c;

    const/4 v2, 0x1

    invoke-direct {v1, v2, p0}, Lcom/tencent/bugly/crashreport/crash/c;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v1, p1, p2}, Lcom/tencent/bugly/proguard/W;->a(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public a(Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;Z)V
    .locals 6

    .line 8
    const-class v0, Lcom/tencent/bugly/crashreport/biz/f;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const-string v0, "[Strategy] Notify %s"

    invoke-static {v0, v2}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 9
    invoke-static {p1, p2}, Lcom/tencent/bugly/crashreport/biz/f;->a(Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;Z)V

    .line 10
    iget-object p2, p0, Lcom/tencent/bugly/crashreport/common/strategy/c;->d:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/tencent/bugly/a;

    .line 11
    :try_start_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    new-array v5, v1, [Ljava/lang/Object;

    aput-object v4, v5, v3

    invoke-static {v0, v5}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 12
    invoke-virtual {v2, p1}, Lcom/tencent/bugly/a;->onServerStrategyChanged(Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v2

    .line 13
    invoke-static {v2}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/Throwable;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 14
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public a(Lcom/tencent/bugly/proguard/sa;)V
    .locals 14

    if-nez p1, :cond_0

    goto :goto_0

    .line 18
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/crashreport/common/strategy/c;->g:Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    if-eqz v0, :cond_1

    iget-wide v1, p1, Lcom/tencent/bugly/proguard/sa;->k:J

    iget-wide v3, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->o:J

    cmp-long v0, v1, v3

    if-nez v0, :cond_1

    :goto_0
    return-void

    .line 19
    :cond_1
    new-instance v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    invoke-direct {v0}, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;-><init>()V

    .line 20
    iget-boolean v1, p1, Lcom/tencent/bugly/proguard/sa;->d:Z

    iput-boolean v1, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->f:Z

    .line 21
    iget-boolean v1, p1, Lcom/tencent/bugly/proguard/sa;->f:Z

    iput-boolean v1, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->h:Z

    .line 22
    iget-boolean v1, p1, Lcom/tencent/bugly/proguard/sa;->e:Z

    iput-boolean v1, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->g:Z

    .line 23
    sget-object v1, Lcom/tencent/bugly/crashreport/common/strategy/c;->c:Ljava/lang/String;

    invoke-static {v1}, Lcom/tencent/bugly/proguard/ca;->b(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v1, :cond_2

    sget-object v1, Lcom/tencent/bugly/crashreport/common/strategy/c;->c:Ljava/lang/String;

    invoke-static {v1}, Lcom/tencent/bugly/proguard/ca;->c(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_4

    .line 24
    :cond_2
    iget-object v1, p1, Lcom/tencent/bugly/proguard/sa;->g:Ljava/lang/String;

    invoke-static {v1}, Lcom/tencent/bugly/proguard/ca;->c(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 25
    iget-object v1, p1, Lcom/tencent/bugly/proguard/sa;->g:Ljava/lang/String;

    new-array v4, v2, [Ljava/lang/Object;

    aput-object v1, v4, v3

    const-string v1, "[Strategy] Upload url changes to %s"

    invoke-static {v1, v4}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 26
    iget-object v1, p1, Lcom/tencent/bugly/proguard/sa;->g:Ljava/lang/String;

    iput-object v1, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->q:Ljava/lang/String;

    .line 27
    :cond_3
    iget-object v1, p1, Lcom/tencent/bugly/proguard/sa;->h:Ljava/lang/String;

    invoke-static {v1}, Lcom/tencent/bugly/proguard/ca;->c(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 28
    iget-object v1, p1, Lcom/tencent/bugly/proguard/sa;->h:Ljava/lang/String;

    new-array v4, v2, [Ljava/lang/Object;

    aput-object v1, v4, v3

    const-string v1, "[Strategy] Exception upload url changes to %s"

    invoke-static {v1, v4}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 29
    iget-object v1, p1, Lcom/tencent/bugly/proguard/sa;->h:Ljava/lang/String;

    iput-object v1, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->r:Ljava/lang/String;

    .line 30
    :cond_4
    iget-object v1, p1, Lcom/tencent/bugly/proguard/sa;->i:Lcom/tencent/bugly/proguard/ra;

    if-eqz v1, :cond_5

    .line 31
    iget-object v1, v1, Lcom/tencent/bugly/proguard/ra;->a:Ljava/lang/String;

    invoke-static {v1}, Lcom/tencent/bugly/proguard/ca;->b(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_5

    .line 32
    iget-object v1, p1, Lcom/tencent/bugly/proguard/sa;->i:Lcom/tencent/bugly/proguard/ra;

    iget-object v1, v1, Lcom/tencent/bugly/proguard/ra;->a:Ljava/lang/String;

    iput-object v1, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->s:Ljava/lang/String;

    .line 33
    :cond_5
    iget-wide v4, p1, Lcom/tencent/bugly/proguard/sa;->k:J

    const-wide/16 v6, 0x0

    cmp-long v1, v4, v6

    if-eqz v1, :cond_6

    .line 34
    iput-wide v4, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->o:J

    .line 35
    :cond_6
    iget-object v1, p1, Lcom/tencent/bugly/proguard/sa;->j:Ljava/util/Map;

    if-eqz v1, :cond_b

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v1

    if-lez v1, :cond_b

    .line 36
    iget-object v1, p1, Lcom/tencent/bugly/proguard/sa;->j:Ljava/util/Map;

    iput-object v1, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->t:Ljava/util/Map;

    const-string v4, "B11"

    .line 37
    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v4, "1"

    if-eqz v1, :cond_7

    .line 38
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 39
    iput-boolean v2, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->i:Z

    goto :goto_1

    .line 40
    :cond_7
    iput-boolean v3, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->i:Z

    .line 41
    :goto_1
    iget-object v1, p1, Lcom/tencent/bugly/proguard/sa;->j:Ljava/util/Map;

    const-string v5, "B3"

    invoke-interface {v1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_8

    .line 42
    invoke-static {v1}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    iput-wide v5, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->w:J

    .line 43
    :cond_8
    iget v1, p1, Lcom/tencent/bugly/proguard/sa;->o:I

    int-to-long v5, v1

    iput-wide v5, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->p:J

    .line 44
    iput-wide v5, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->v:J

    .line 45
    iget-object v1, p1, Lcom/tencent/bugly/proguard/sa;->j:Ljava/util/Map;

    const-string v5, "B27"

    .line 46
    invoke-interface {v1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_9

    .line 47
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_9

    .line 48
    :try_start_0
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    if-lez v1, :cond_9

    .line 49
    iput v1, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->u:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v1

    .line 50
    invoke-static {v1}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/Throwable;)Z

    move-result v5

    if-nez v5, :cond_9

    .line 51
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 52
    :cond_9
    :goto_2
    iget-object v1, p1, Lcom/tencent/bugly/proguard/sa;->j:Ljava/util/Map;

    const-string v5, "B25"

    invoke-interface {v1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_a

    .line 53
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    .line 54
    iput-boolean v2, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->k:Z

    goto :goto_3

    .line 55
    :cond_a
    iput-boolean v3, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->k:Z

    .line 56
    :cond_b
    :goto_3
    iget-boolean v1, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->f:Z

    .line 57
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iget-boolean v4, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->h:Z

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    iget-boolean v5, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->g:Z

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    iget-boolean v6, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->i:Z

    .line 58
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    iget-boolean v7, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->j:Z

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    iget-boolean v8, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->m:Z

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    iget-boolean v9, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->n:Z

    .line 59
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    iget-wide v10, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->p:J

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    iget-boolean v11, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->k:Z

    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v11

    iget-wide v12, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->o:J

    .line 60
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    const/16 v13, 0xa

    new-array v13, v13, [Ljava/lang/Object;

    aput-object v1, v13, v3

    aput-object v4, v13, v2

    const/4 v1, 0x2

    aput-object v5, v13, v1

    const/4 v4, 0x3

    aput-object v6, v13, v4

    const/4 v4, 0x4

    aput-object v7, v13, v4

    const/4 v4, 0x5

    aput-object v8, v13, v4

    const/4 v4, 0x6

    aput-object v9, v13, v4

    const/4 v4, 0x7

    aput-object v10, v13, v4

    const/16 v4, 0x8

    aput-object v11, v13, v4

    const/16 v4, 0x9

    aput-object v12, v13, v4

    const-string v4, "[Strategy] enableCrashReport:%b, enableQuery:%b, enableUserInfo:%b, enableAnr:%b, enableBlock:%b, enableSession:%b, enableSessionTimer:%b, sessionOverTime:%d, enableCocos:%b, strategyLastUpdateTime:%d"

    .line 61
    invoke-static {v4, v13}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 62
    iput-object v0, p0, Lcom/tencent/bugly/crashreport/common/strategy/c;->g:Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    .line 63
    iget-object v4, p1, Lcom/tencent/bugly/proguard/sa;->g:Ljava/lang/String;

    invoke-static {v4}, Lcom/tencent/bugly/proguard/ca;->c(Ljava/lang/String;)Z

    move-result v4

    const-string v5, ""

    if-nez v4, :cond_c

    .line 64
    new-array v4, v3, [Ljava/lang/Object;

    const-string v6, "[Strategy] download url is null"

    invoke-static {v6, v4}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 65
    iget-object v4, p0, Lcom/tencent/bugly/crashreport/common/strategy/c;->g:Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    iput-object v5, v4, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->q:Ljava/lang/String;

    .line 66
    :cond_c
    iget-object p1, p1, Lcom/tencent/bugly/proguard/sa;->h:Ljava/lang/String;

    invoke-static {p1}, Lcom/tencent/bugly/proguard/ca;->c(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_d

    .line 67
    new-array p1, v3, [Ljava/lang/Object;

    const-string v3, "[Strategy] download crashurl is null"

    invoke-static {v3, p1}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 68
    iget-object p1, p0, Lcom/tencent/bugly/crashreport/common/strategy/c;->g:Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    iput-object v5, p1, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->r:Ljava/lang/String;

    .line 69
    :cond_d
    invoke-static {}, Lcom/tencent/bugly/proguard/J;->a()Lcom/tencent/bugly/proguard/J;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/tencent/bugly/proguard/J;->b(I)V

    .line 70
    new-instance p1, Lcom/tencent/bugly/proguard/L;

    invoke-direct {p1}, Lcom/tencent/bugly/proguard/L;-><init>()V

    .line 71
    iput v1, p1, Lcom/tencent/bugly/proguard/L;->b:I

    .line 72
    iget-wide v3, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->d:J

    iput-wide v3, p1, Lcom/tencent/bugly/proguard/L;->a:J

    .line 73
    iget-wide v3, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->e:J

    iput-wide v3, p1, Lcom/tencent/bugly/proguard/L;->e:J

    .line 74
    invoke-static {v0}, Lcom/tencent/bugly/proguard/ca;->a(Landroid/os/Parcelable;)[B

    move-result-object v1

    iput-object v1, p1, Lcom/tencent/bugly/proguard/L;->g:[B

    .line 75
    invoke-static {}, Lcom/tencent/bugly/proguard/J;->a()Lcom/tencent/bugly/proguard/J;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/tencent/bugly/proguard/J;->c(Lcom/tencent/bugly/proguard/L;)Z

    .line 76
    invoke-virtual {p0, v0, v2}, Lcom/tencent/bugly/crashreport/common/strategy/c;->a(Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;Z)V

    return-void
.end method

.method public c()Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tencent/bugly/crashreport/common/strategy/c;->g:Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-object v0, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->q:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {v0}, Lcom/tencent/bugly/proguard/ca;->c(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lcom/tencent/bugly/crashreport/common/strategy/c;->g:Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    .line 14
    .line 15
    sget-object v1, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->a:Ljava/lang/String;

    .line 16
    .line 17
    iput-object v1, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->q:Ljava/lang/String;

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/crashreport/common/strategy/c;->g:Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    .line 20
    .line 21
    iget-object v0, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->r:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v0}, Lcom/tencent/bugly/proguard/ca;->c(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    iget-object v0, p0, Lcom/tencent/bugly/crashreport/common/strategy/c;->g:Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    .line 30
    .line 31
    sget-object v1, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->b:Ljava/lang/String;

    .line 32
    .line 33
    iput-object v1, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->r:Ljava/lang/String;

    .line 34
    .line 35
    :cond_1
    iget-object v0, p0, Lcom/tencent/bugly/crashreport/common/strategy/c;->g:Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    .line 36
    .line 37
    return-object v0

    .line 38
    :cond_2
    sget-object v0, Lcom/tencent/bugly/crashreport/common/strategy/c;->c:Ljava/lang/String;

    .line 39
    .line 40
    invoke-static {v0}, Lcom/tencent/bugly/proguard/ca;->b(Ljava/lang/String;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-nez v0, :cond_3

    .line 45
    .line 46
    sget-object v0, Lcom/tencent/bugly/crashreport/common/strategy/c;->c:Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {v0}, Lcom/tencent/bugly/proguard/ca;->c(Ljava/lang/String;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_3

    .line 53
    .line 54
    iget-object v0, p0, Lcom/tencent/bugly/crashreport/common/strategy/c;->f:Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    .line 55
    .line 56
    sget-object v1, Lcom/tencent/bugly/crashreport/common/strategy/c;->c:Ljava/lang/String;

    .line 57
    .line 58
    iput-object v1, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->q:Ljava/lang/String;

    .line 59
    .line 60
    iput-object v1, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->r:Ljava/lang/String;

    .line 61
    .line 62
    :cond_3
    iget-object v0, p0, Lcom/tencent/bugly/crashreport/common/strategy/c;->f:Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    .line 63
    .line 64
    return-object v0
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

.method public declared-synchronized d()Z
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/tencent/bugly/crashreport/common/strategy/c;->g:Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    monitor-exit p0

    .line 10
    return v0

    .line 11
    :catchall_0
    move-exception v0

    .line 12
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 13
    throw v0
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

.method public e()Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;
    .locals 2

    .line 1
    invoke-static {}, Lcom/tencent/bugly/proguard/J;->a()Lcom/tencent/bugly/proguard/J;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x2

    .line 6
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/J;->a(I)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-lez v1, :cond_0

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Lcom/tencent/bugly/proguard/L;

    .line 24
    .line 25
    iget-object v0, v0, Lcom/tencent/bugly/proguard/L;->g:[B

    .line 26
    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    sget-object v1, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 30
    .line 31
    invoke-static {v0, v1}, Lcom/tencent/bugly/proguard/ca;->a([BLandroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    .line 36
    .line 37
    return-object v0

    .line 38
    :cond_0
    const/4 v0, 0x0

    .line 39
    return-object v0
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
