.class public Lcom/tencent/bugly/beta/upgrade/BetaUploadStrategy;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Landroid/os/Parcelable;
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/tencent/bugly/beta/upgrade/BetaUploadStrategy;",
        ">;"
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/tencent/bugly/beta/upgrade/BetaUploadStrategy;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public a:Lcom/tencent/bugly/proguard/sa;

.field public b:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/tencent/bugly/beta/upgrade/BetaUploadStrategy;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/tencent/bugly/beta/upgrade/BetaUploadStrategy;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/tencent/bugly/beta/upgrade/BetaUploadStrategy;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 7
    .line 8
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

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lcom/tencent/bugly/proguard/sa;

    invoke-direct {v0}, Lcom/tencent/bugly/proguard/sa;-><init>()V

    iput-object v0, p0, Lcom/tencent/bugly/beta/upgrade/BetaUploadStrategy;->a:Lcom/tencent/bugly/proguard/sa;

    const/4 v1, 0x1

    .line 3
    iput-boolean v1, v0, Lcom/tencent/bugly/proguard/sa;->e:Z

    .line 4
    iput-boolean v1, v0, Lcom/tencent/bugly/proguard/sa;->f:Z

    .line 5
    sget-object v1, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->a:Ljava/lang/String;

    iput-object v1, v0, Lcom/tencent/bugly/proguard/sa;->g:Ljava/lang/String;

    .line 6
    iput-object v1, v0, Lcom/tencent/bugly/proguard/sa;->h:Ljava/lang/String;

    .line 7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 8
    iget-object v2, p0, Lcom/tencent/bugly/beta/upgrade/BetaUploadStrategy;->a:Lcom/tencent/bugly/proguard/sa;

    iput-wide v0, v2, Lcom/tencent/bugly/proguard/sa;->k:J

    .line 9
    iput-wide v0, p0, Lcom/tencent/bugly/beta/upgrade/BetaUploadStrategy;->b:J

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    invoke-virtual {p1}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object v0

    const-class v1, Lcom/tencent/bugly/proguard/sa;

    invoke-static {v0, v1}, Lcom/tencent/bugly/proguard/M;->a([BLjava/lang/Class;)Lcom/tencent/bugly/proguard/m;

    move-result-object v0

    check-cast v0, Lcom/tencent/bugly/proguard/sa;

    iput-object v0, p0, Lcom/tencent/bugly/beta/upgrade/BetaUploadStrategy;->a:Lcom/tencent/bugly/proguard/sa;

    .line 12
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/tencent/bugly/beta/upgrade/BetaUploadStrategy;->b:J

    return-void
.end method


# virtual methods
.method public createFromParcel(Landroid/os/Parcel;)Lcom/tencent/bugly/beta/upgrade/BetaUploadStrategy;
    .locals 1

    .line 2
    new-instance v0, Lcom/tencent/bugly/beta/upgrade/BetaUploadStrategy;

    invoke-direct {v0, p1}, Lcom/tencent/bugly/beta/upgrade/BetaUploadStrategy;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/beta/upgrade/BetaUploadStrategy;->createFromParcel(Landroid/os/Parcel;)Lcom/tencent/bugly/beta/upgrade/BetaUploadStrategy;

    move-result-object p1

    return-object p1
.end method

.method public describeContents()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
    .line 3
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

.method public newArray(I)[Lcom/tencent/bugly/beta/upgrade/BetaUploadStrategy;
    .locals 0

    .line 2
    new-array p1, p1, [Lcom/tencent/bugly/beta/upgrade/BetaUploadStrategy;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/beta/upgrade/BetaUploadStrategy;->newArray(I)[Lcom/tencent/bugly/beta/upgrade/BetaUploadStrategy;

    move-result-object p1

    return-object p1
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 1
    iget-object p2, p0, Lcom/tencent/bugly/beta/upgrade/BetaUploadStrategy;->a:Lcom/tencent/bugly/proguard/sa;

    .line 2
    .line 3
    invoke-static {p2}, Lcom/tencent/bugly/proguard/M;->a(Lcom/tencent/bugly/proguard/m;)[B

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByteArray([B)V

    .line 8
    .line 9
    .line 10
    iget-wide v0, p0, Lcom/tencent/bugly/beta/upgrade/BetaUploadStrategy;->b:J

    .line 11
    .line 12
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 13
    .line 14
    .line 15
    return-void
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
