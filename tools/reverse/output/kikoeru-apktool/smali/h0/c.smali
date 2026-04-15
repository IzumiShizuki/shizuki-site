.class public final Lh0/c;
.super Ljc/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/k;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(JI)V
    .locals 0

    .line 1
    iput p3, p0, Lh0/c;->b:I

    .line 2
    .line 3
    iput-wide p1, p0, Lh0/c;->c:J

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
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
    .locals 7

    .line 1
    iget v0, p0, Lh0/c;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lq2/k;

    .line 7
    .line 8
    sget-object v0, Ll0/k0;->c:Lq2/w;

    .line 9
    .line 10
    new-instance v1, Ll0/j0;

    .line 11
    .line 12
    sget-object v5, Ll0/i0;->b:Ll0/i0;

    .line 13
    .line 14
    const/4 v6, 0x1

    .line 15
    sget-object v2, Lh0/h0;->a:Lh0/h0;

    .line 16
    .line 17
    iget-wide v3, p0, Lh0/c;->c:J

    .line 18
    .line 19
    invoke-direct/range {v1 .. v6}, Ll0/j0;-><init>(Lh0/h0;JLl0/i0;Z)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v0, v1}, Lq2/k;->l(Lq2/w;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 26
    .line 27
    return-object p1

    .line 28
    :pswitch_0
    check-cast p1, Ln1/c;

    .line 29
    .line 30
    iget-object v0, p1, Ln1/c;->a:Ln1/a;

    .line 31
    .line 32
    invoke-interface {v0}, Ln1/a;->e()J

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    const/16 v2, 0x20

    .line 37
    .line 38
    shr-long/2addr v0, v2

    .line 39
    long-to-int v1, v0

    .line 40
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    const/high16 v1, 0x40000000    # 2.0f

    .line 45
    .line 46
    div-float/2addr v0, v1

    .line 47
    invoke-static {p1, v0}, Ll0/u0;->q(Ln1/c;F)Lq1/f;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    new-instance v2, Lq1/k;

    .line 52
    .line 53
    iget-wide v3, p0, Lh0/c;->c:J

    .line 54
    .line 55
    const/4 v5, 0x5

    .line 56
    invoke-direct {v2, v3, v4, v5}, Lq1/k;-><init>(JI)V

    .line 57
    .line 58
    .line 59
    new-instance v3, Lb0/g1;

    .line 60
    .line 61
    const/4 v4, 0x1

    .line 62
    invoke-direct {v3, v0, v1, v2, v4}, Lb0/g1;-><init>(FLjava/lang/Object;Ljava/lang/Object;I)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v3}, Ln1/c;->b(Lic/k;)Li7/p2;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    return-object p1

    .line 70
    nop

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method
