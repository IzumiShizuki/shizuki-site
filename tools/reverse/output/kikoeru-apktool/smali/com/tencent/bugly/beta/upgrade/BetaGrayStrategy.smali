.class public Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;
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
        "Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;",
        ">;"
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public a:Lcom/tencent/bugly/proguard/B;

.field public b:I

.field public c:J

.field public d:Z

.field public e:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->CREATOR:Landroid/os/Parcelable$Creator;

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

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 12
    iput v0, p0, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->b:I

    const-wide/16 v1, -0x1

    .line 13
    iput-wide v1, p0, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->c:J

    .line 14
    iput-boolean v0, p0, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->d:Z

    .line 15
    iput-wide v1, p0, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->e:J

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->b:I

    const-wide/16 v1, -0x1

    .line 3
    iput-wide v1, p0, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->c:J

    .line 4
    iput-boolean v0, p0, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->d:Z

    .line 5
    iput-wide v1, p0, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->e:J

    .line 6
    invoke-virtual {p1}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object v1

    const-class v2, Lcom/tencent/bugly/proguard/B;

    invoke-static {v1, v2}, Lcom/tencent/bugly/proguard/M;->a([BLjava/lang/Class;)Lcom/tencent/bugly/proguard/m;

    move-result-object v1

    check-cast v1, Lcom/tencent/bugly/proguard/B;

    iput-object v1, p0, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    .line 7
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, p0, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->b:I

    .line 8
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v1

    iput-wide v1, p0, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->c:J

    .line 9
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v1

    const/4 v2, 0x1

    if-ne v2, v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    iput-boolean v0, p0, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->d:Z

    .line 10
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->e:J

    return-void
.end method


# virtual methods
.method public createFromParcel(Landroid/os/Parcel;)Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;
    .locals 1

    .line 2
    new-instance v0, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

    invoke-direct {v0, p1}, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->createFromParcel(Landroid/os/Parcel;)Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

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

.method public newArray(I)[Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;
    .locals 0

    .line 2
    new-array p1, p1, [Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->newArray(I)[Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

    move-result-object p1

    return-object p1
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 1
    iget-object p2, p0, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

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
    iget p2, p0, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->b:I

    .line 11
    .line 12
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 13
    .line 14
    .line 15
    iget-wide v0, p0, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->c:J

    .line 16
    .line 17
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 18
    .line 19
    .line 20
    iget-boolean p2, p0, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->d:Z

    .line 21
    .line 22
    int-to-byte p2, p2

    .line 23
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 24
    .line 25
    .line 26
    iget-wide v0, p0, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->e:J

    .line 27
    .line 28
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 29
    .line 30
    .line 31
    return-void
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
