.class public final synthetic Ls0/c;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/k;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ls0/i;


# direct methods
.method public synthetic constructor <init>(Ls0/i;I)V
    .locals 0

    .line 1
    iput p2, p0, Ls0/c;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Ls0/c;->b:Ls0/i;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
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


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Ls0/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lf3/l;

    .line 7
    .line 8
    iget-object v0, p0, Ls0/c;->b:Ls0/i;

    .line 9
    .line 10
    iget-object v1, v0, Ls0/i;->p:Lx0/e1;

    .line 11
    .line 12
    invoke-virtual {v1, p1}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ls0/i;->j()V

    .line 16
    .line 17
    .line 18
    :goto_0
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 19
    .line 20
    return-object p1

    .line 21
    :pswitch_0
    check-cast p1, Lg2/c0;

    .line 22
    .line 23
    invoke-interface {p1}, Lg2/c0;->B()Lg2/c0;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {p1}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    invoke-interface {p1}, Lg2/c0;->k()J

    .line 31
    .line 32
    .line 33
    move-result-wide v0

    .line 34
    const-wide/16 v2, 0x0

    .line 35
    .line 36
    invoke-interface {p1, v2, v3}, Lg2/c0;->c(J)J

    .line 37
    .line 38
    .line 39
    move-result-wide v2

    .line 40
    const/16 p1, 0x20

    .line 41
    .line 42
    shr-long v4, v2, p1

    .line 43
    .line 44
    long-to-int v5, v4

    .line 45
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    invoke-static {v4}, Llc/b;->R(F)I

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    const-wide v5, 0xffffffffL

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    and-long/2addr v2, v5

    .line 59
    long-to-int v3, v2

    .line 60
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    invoke-static {v2}, Llc/b;->R(F)I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    int-to-long v3, v4

    .line 69
    shl-long/2addr v3, p1

    .line 70
    int-to-long v7, v2

    .line 71
    and-long/2addr v7, v5

    .line 72
    or-long/2addr v3, v7

    .line 73
    new-instance v2, Lf3/k;

    .line 74
    .line 75
    shr-long v7, v3, p1

    .line 76
    .line 77
    long-to-int v8, v7

    .line 78
    and-long/2addr v3, v5

    .line 79
    long-to-int v4, v3

    .line 80
    shr-long v9, v0, p1

    .line 81
    .line 82
    long-to-int p1, v9

    .line 83
    add-int/2addr p1, v8

    .line 84
    and-long/2addr v0, v5

    .line 85
    long-to-int v1, v0

    .line 86
    add-int/2addr v1, v4

    .line 87
    invoke-direct {v2, v8, v4, p1, v1}, Lf3/k;-><init>(IIII)V

    .line 88
    .line 89
    .line 90
    iget-object p1, p0, Ls0/c;->b:Ls0/i;

    .line 91
    .line 92
    iget-object v0, p1, Ls0/i;->o:Lx0/e1;

    .line 93
    .line 94
    invoke-virtual {v0, v2}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1}, Ls0/i;->j()V

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 102
    .line 103
    .line 104
    .line 105
.end method
