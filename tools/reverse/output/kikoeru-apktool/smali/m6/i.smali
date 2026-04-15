.class public abstract Lm6/i;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final a:Lm6/e;

.field public b:Lr5/h0;

.field public c:Lr5/q;

.field public d:Lm6/g;

.field public e:J

.field public f:J

.field public g:J

.field public h:I

.field public i:I

.field public j:Lm0/w;

.field public k:J

.field public l:Z

.field public m:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lm6/e;

    .line 5
    .line 6
    invoke-direct {v0}, Lm6/e;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lm6/i;->a:Lm6/e;

    .line 10
    .line 11
    new-instance v0, Lm0/w;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-direct {v0, v1}, Lm0/w;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lm6/i;->j:Lm0/w;

    .line 18
    .line 19
    return-void
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
.method public a(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lm6/i;->g:J

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

.method public abstract b(Lp4/s;)J
.end method

.method public abstract c(Lp4/s;JLm0/w;)Z
.end method

.method public d(Z)V
    .locals 4

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    new-instance p1, Lm0/w;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-direct {p1, v2}, Lm0/w;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lm6/i;->j:Lm0/w;

    .line 12
    .line 13
    iput-wide v0, p0, Lm6/i;->f:J

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    iput p1, p0, Lm6/i;->h:I

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 p1, 0x1

    .line 20
    iput p1, p0, Lm6/i;->h:I

    .line 21
    .line 22
    :goto_0
    const-wide/16 v2, -0x1

    .line 23
    .line 24
    iput-wide v2, p0, Lm6/i;->e:J

    .line 25
    .line 26
    iput-wide v0, p0, Lm6/i;->g:J

    .line 27
    .line 28
    return-void
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method
