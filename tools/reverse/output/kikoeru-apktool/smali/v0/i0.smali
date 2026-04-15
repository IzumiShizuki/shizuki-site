.class public final Lv0/i0;
.super Ljc/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/k;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lv0/l0;


# direct methods
.method public synthetic constructor <init>(Lv0/l0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lv0/i0;->b:I

    .line 2
    .line 3
    iput-object p1, p0, Lv0/i0;->c:Lv0/l0;

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
    .locals 3

    .line 1
    iget v0, p0, Lv0/i0;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lp1/b;

    .line 7
    .line 8
    iget-wide v0, p1, Lp1/b;->a:J

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    iget-object v0, p0, Lv0/i0;->c:Lv0/l0;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lv0/l0;->a(F)V

    .line 14
    .line 15
    .line 16
    iget-object p1, v0, Lv0/l0;->j:Lr2/a;

    .line 17
    .line 18
    invoke-virtual {p1}, Lr2/a;->b()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_0
    check-cast p1, Ljava/lang/Number;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    iget-object v0, p0, Lv0/i0;->c:Lv0/l0;

    .line 31
    .line 32
    iget-object v1, v0, Lv0/l0;->b:Loc/a;

    .line 33
    .line 34
    iget v2, v1, Loc/a;->a:F

    .line 35
    .line 36
    iget v1, v1, Loc/a;->b:F

    .line 37
    .line 38
    invoke-static {p1, v2, v1}, Lnh/b;->j(FFF)F

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    iget-object v1, v0, Lv0/l0;->c:Lx0/a1;

    .line 43
    .line 44
    invoke-virtual {v1}, Lx0/a1;->e()F

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    cmpg-float v2, p1, v2

    .line 49
    .line 50
    if-nez v2, :cond_0

    .line 51
    .line 52
    const/4 p1, 0x0

    .line 53
    goto :goto_1

    .line 54
    :cond_0
    invoke-virtual {v1}, Lx0/a1;->e()F

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    cmpg-float v1, p1, v1

    .line 59
    .line 60
    if-nez v1, :cond_1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    iget-object v1, v0, Lv0/l0;->d:Lic/k;

    .line 64
    .line 65
    if-eqz v1, :cond_2

    .line 66
    .line 67
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-interface {v1, p1}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_2
    invoke-virtual {v0, p1}, Lv0/l0;->c(F)V

    .line 76
    .line 77
    .line 78
    :goto_0
    iget-object p1, v0, Lv0/l0;->a:Lic/a;

    .line 79
    .line 80
    if-eqz p1, :cond_3

    .line 81
    .line 82
    invoke-interface {p1}, Lic/a;->b()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    :cond_3
    const/4 p1, 0x1

    .line 86
    :goto_1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    return-object p1

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
