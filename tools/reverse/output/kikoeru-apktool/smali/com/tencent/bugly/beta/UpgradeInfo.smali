.class public Lcom/tencent/bugly/beta/UpgradeInfo;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public apkMd5:Ljava/lang/String;

.field public apkUrl:Ljava/lang/String;

.field public fileSize:J

.field public id:Ljava/lang/String;

.field public imageUrl:Ljava/lang/String;

.field public newFeature:Ljava/lang/String;

.field public popInterval:J

.field public popTimes:I

.field public publishTime:J

.field public publishType:I

.field public title:Ljava/lang/String;

.field public updateType:I

.field public upgradeType:I

.field public versionCode:I

.field public versionName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/tencent/bugly/proguard/B;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    iput-object v0, p0, Lcom/tencent/bugly/beta/UpgradeInfo;->id:Ljava/lang/String;

    .line 7
    .line 8
    iput-object v0, p0, Lcom/tencent/bugly/beta/UpgradeInfo;->title:Ljava/lang/String;

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/bugly/beta/UpgradeInfo;->newFeature:Ljava/lang/String;

    .line 11
    .line 12
    const-wide/16 v1, 0x0

    .line 13
    .line 14
    iput-wide v1, p0, Lcom/tencent/bugly/beta/UpgradeInfo;->publishTime:J

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    iput v3, p0, Lcom/tencent/bugly/beta/UpgradeInfo;->publishType:I

    .line 18
    .line 19
    const/4 v4, 0x1

    .line 20
    iput v4, p0, Lcom/tencent/bugly/beta/UpgradeInfo;->upgradeType:I

    .line 21
    .line 22
    iput v3, p0, Lcom/tencent/bugly/beta/UpgradeInfo;->popTimes:I

    .line 23
    .line 24
    iput-wide v1, p0, Lcom/tencent/bugly/beta/UpgradeInfo;->popInterval:J

    .line 25
    .line 26
    iput-object v0, p0, Lcom/tencent/bugly/beta/UpgradeInfo;->versionName:Ljava/lang/String;

    .line 27
    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    iget-object v0, p1, Lcom/tencent/bugly/proguard/B;->r:Ljava/lang/String;

    .line 31
    .line 32
    iput-object v0, p0, Lcom/tencent/bugly/beta/UpgradeInfo;->id:Ljava/lang/String;

    .line 33
    .line 34
    iget-object v0, p1, Lcom/tencent/bugly/proguard/B;->f:Ljava/lang/String;

    .line 35
    .line 36
    iput-object v0, p0, Lcom/tencent/bugly/beta/UpgradeInfo;->title:Ljava/lang/String;

    .line 37
    .line 38
    iget-object v0, p1, Lcom/tencent/bugly/proguard/B;->g:Ljava/lang/String;

    .line 39
    .line 40
    iput-object v0, p0, Lcom/tencent/bugly/beta/UpgradeInfo;->newFeature:Ljava/lang/String;

    .line 41
    .line 42
    iget-wide v0, p1, Lcom/tencent/bugly/proguard/B;->h:J

    .line 43
    .line 44
    iput-wide v0, p0, Lcom/tencent/bugly/beta/UpgradeInfo;->publishTime:J

    .line 45
    .line 46
    iget v0, p1, Lcom/tencent/bugly/proguard/B;->i:I

    .line 47
    .line 48
    iput v0, p0, Lcom/tencent/bugly/beta/UpgradeInfo;->publishType:I

    .line 49
    .line 50
    iget-byte v0, p1, Lcom/tencent/bugly/proguard/B;->l:B

    .line 51
    .line 52
    iput v0, p0, Lcom/tencent/bugly/beta/UpgradeInfo;->upgradeType:I

    .line 53
    .line 54
    iget v0, p1, Lcom/tencent/bugly/proguard/B;->m:I

    .line 55
    .line 56
    iput v0, p0, Lcom/tencent/bugly/beta/UpgradeInfo;->popTimes:I

    .line 57
    .line 58
    iget-wide v0, p1, Lcom/tencent/bugly/proguard/B;->n:J

    .line 59
    .line 60
    iput-wide v0, p0, Lcom/tencent/bugly/beta/UpgradeInfo;->popInterval:J

    .line 61
    .line 62
    iget-object v0, p1, Lcom/tencent/bugly/proguard/B;->j:Lcom/tencent/bugly/proguard/y;

    .line 63
    .line 64
    iget v1, v0, Lcom/tencent/bugly/proguard/y;->d:I

    .line 65
    .line 66
    iput v1, p0, Lcom/tencent/bugly/beta/UpgradeInfo;->versionCode:I

    .line 67
    .line 68
    iget-object v1, v0, Lcom/tencent/bugly/proguard/y;->e:Ljava/lang/String;

    .line 69
    .line 70
    iput-object v1, p0, Lcom/tencent/bugly/beta/UpgradeInfo;->versionName:Ljava/lang/String;

    .line 71
    .line 72
    iget-object v0, v0, Lcom/tencent/bugly/proguard/y;->j:Ljava/lang/String;

    .line 73
    .line 74
    iput-object v0, p0, Lcom/tencent/bugly/beta/UpgradeInfo;->apkMd5:Ljava/lang/String;

    .line 75
    .line 76
    iget-object v0, p1, Lcom/tencent/bugly/proguard/B;->k:Lcom/tencent/bugly/proguard/x;

    .line 77
    .line 78
    iget-object v1, v0, Lcom/tencent/bugly/proguard/x;->c:Ljava/lang/String;

    .line 79
    .line 80
    iput-object v1, p0, Lcom/tencent/bugly/beta/UpgradeInfo;->apkUrl:Ljava/lang/String;

    .line 81
    .line 82
    iget-wide v0, v0, Lcom/tencent/bugly/proguard/x;->e:J

    .line 83
    .line 84
    iput-wide v0, p0, Lcom/tencent/bugly/beta/UpgradeInfo;->fileSize:J

    .line 85
    .line 86
    iget-object v0, p1, Lcom/tencent/bugly/proguard/B;->q:Ljava/util/Map;

    .line 87
    .line 88
    const-string v1, "IMG_title"

    .line 89
    .line 90
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    check-cast v0, Ljava/lang/String;

    .line 95
    .line 96
    iput-object v0, p0, Lcom/tencent/bugly/beta/UpgradeInfo;->imageUrl:Ljava/lang/String;

    .line 97
    .line 98
    iget p1, p1, Lcom/tencent/bugly/proguard/B;->u:I

    .line 99
    .line 100
    iput p1, p0, Lcom/tencent/bugly/beta/UpgradeInfo;->updateType:I

    .line 101
    .line 102
    :cond_0
    return-void
    .line 103
    .line 104
    .line 105
.end method
