.class public final Lv0/l;
.super Ljc/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/k;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lg2/g1;

.field public final synthetic d:I

.field public final synthetic e:I


# direct methods
.method public constructor <init>(IILg2/g1;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lv0/l;->b:I

    .line 1
    iput p1, p0, Lv0/l;->d:I

    iput-object p3, p0, Lv0/l;->c:Lg2/g1;

    iput p2, p0, Lv0/l;->e:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    return-void
.end method

.method public synthetic constructor <init>(Lg2/g1;III)V
    .locals 0

    .line 2
    iput p4, p0, Lv0/l;->b:I

    iput-object p1, p0, Lv0/l;->c:Lg2/g1;

    iput p2, p0, Lv0/l;->d:I

    iput p3, p0, Lv0/l;->e:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lv0/l;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lg2/f1;

    .line 7
    .line 8
    iget v0, p0, Lv0/l;->d:I

    .line 9
    .line 10
    iget v1, p0, Lv0/l;->e:I

    .line 11
    .line 12
    iget-object v2, p0, Lv0/l;->c:Lg2/g1;

    .line 13
    .line 14
    invoke-static {p1, v2, v0, v1}, Lg2/f1;->i(Lg2/f1;Lg2/g1;II)V

    .line 15
    .line 16
    .line 17
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 18
    .line 19
    return-object p1

    .line 20
    :pswitch_0
    check-cast p1, Lg2/f1;

    .line 21
    .line 22
    iget v0, p0, Lv0/l;->d:I

    .line 23
    .line 24
    iget v1, p0, Lv0/l;->e:I

    .line 25
    .line 26
    iget-object v2, p0, Lv0/l;->c:Lg2/g1;

    .line 27
    .line 28
    invoke-static {p1, v2, v0, v1}, Lg2/f1;->i(Lg2/f1;Lg2/g1;II)V

    .line 29
    .line 30
    .line 31
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 32
    .line 33
    return-object p1

    .line 34
    :pswitch_1
    check-cast p1, Lg2/f1;

    .line 35
    .line 36
    iget-object v0, p0, Lv0/l;->c:Lg2/g1;

    .line 37
    .line 38
    iget v1, v0, Lg2/g1;->a:I

    .line 39
    .line 40
    iget v2, p0, Lv0/l;->d:I

    .line 41
    .line 42
    sub-int/2addr v2, v1

    .line 43
    int-to-float v1, v2

    .line 44
    const/high16 v2, 0x40000000    # 2.0f

    .line 45
    .line 46
    div-float/2addr v1, v2

    .line 47
    invoke-static {v1}, Llc/b;->R(F)I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    iget v3, p0, Lv0/l;->e:I

    .line 52
    .line 53
    iget v4, v0, Lg2/g1;->b:I

    .line 54
    .line 55
    sub-int/2addr v3, v4

    .line 56
    int-to-float v3, v3

    .line 57
    div-float/2addr v3, v2

    .line 58
    invoke-static {v3}, Llc/b;->R(F)I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    invoke-static {p1, v0, v1, v2}, Lg2/f1;->i(Lg2/f1;Lg2/g1;II)V

    .line 63
    .line 64
    .line 65
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 66
    .line 67
    return-object p1

    .line 68
    nop

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method
