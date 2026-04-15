.class public final Lr/u1;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lr/u;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Lr/v;


# direct methods
.method public constructor <init>(IILr/v;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput p1, p0, Lr/u1;->a:I

    .line 5
    iput p2, p0, Lr/u1;->b:I

    .line 6
    iput-object p3, p0, Lr/u1;->c:Lr/v;

    return-void
.end method

.method public constructor <init>(ILr/v;I)V
    .locals 1

    and-int/lit8 v0, p3, 0x1

    if-eqz v0, :cond_0

    const/16 p1, 0x12c

    :cond_0
    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_1

    .line 1
    sget-object p2, Lr/w;->a:Lr/r;

    :cond_1
    const/4 p3, 0x0

    .line 2
    invoke-direct {p0, p1, p3, p2}, Lr/u1;-><init>(IILr/v;)V

    return-void
.end method


# virtual methods
.method public final a(Lr/v1;)Lr/a2;
    .locals 3

    .line 2
    new-instance p1, Lch/z;

    iget v0, p0, Lr/u1;->b:I

    iget-object v1, p0, Lr/u1;->c:Lr/v;

    iget v2, p0, Lr/u1;->a:I

    invoke-direct {p1, v2, v0, v1}, Lch/z;-><init>(IILr/v;)V

    return-object p1
.end method

.method public final a(Lr/v1;)Lr/x1;
    .locals 3

    .line 1
    new-instance p1, Lch/z;

    iget v0, p0, Lr/u1;->b:I

    iget-object v1, p0, Lr/u1;->c:Lr/v;

    iget v2, p0, Lr/u1;->a:I

    invoke-direct {p1, v2, v0, v1}, Lch/z;-><init>(IILr/v;)V

    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    instance-of v0, p1, Lr/u1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p1, Lr/u1;

    .line 7
    .line 8
    iget v0, p1, Lr/u1;->a:I

    .line 9
    .line 10
    iget v2, p0, Lr/u1;->a:I

    .line 11
    .line 12
    if-ne v0, v2, :cond_0

    .line 13
    .line 14
    iget v0, p1, Lr/u1;->b:I

    .line 15
    .line 16
    iget v2, p0, Lr/u1;->b:I

    .line 17
    .line 18
    if-ne v0, v2, :cond_0

    .line 19
    .line 20
    iget-object p1, p1, Lr/u1;->c:Lr/v;

    .line 21
    .line 22
    iget-object v0, p0, Lr/u1;->c:Lr/v;

    .line 23
    .line 24
    invoke-static {p1, v0}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    const/4 p1, 0x1

    .line 31
    return p1

    .line 32
    :cond_0
    return v1
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget v0, p0, Lr/u1;->a:I

    .line 2
    .line 3
    mul-int/lit8 v0, v0, 0x1f

    .line 4
    .line 5
    iget-object v1, p0, Lr/u1;->c:Lr/v;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    add-int/2addr v1, v0

    .line 12
    mul-int/lit8 v1, v1, 0x1f

    .line 13
    .line 14
    iget v0, p0, Lr/u1;->b:I

    .line 15
    .line 16
    add-int/2addr v1, v0

    .line 17
    return v1
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
