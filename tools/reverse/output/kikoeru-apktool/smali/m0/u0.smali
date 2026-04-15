.class public final Lm0/u0;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ly/d1;

.field public final synthetic c:Lic/o;


# direct methods
.method public synthetic constructor <init>(Ly/d1;Lic/o;I)V
    .locals 0

    .line 1
    iput p3, p0, Lm0/u0;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lm0/u0;->b:Ly/d1;

    .line 4
    .line 5
    iput-object p2, p0, Lm0/u0;->c:Lic/o;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
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
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method


# virtual methods
.method public final q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lm0/u0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lx0/o;

    .line 7
    .line 8
    check-cast p2, Ljava/lang/Number;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    and-int/lit8 v0, p2, 0x3

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    const/4 v2, 0x1

    .line 18
    if-eq v0, v1, :cond_0

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    :goto_0
    and-int/2addr p2, v2

    .line 24
    invoke-virtual {p1, p2, v0}, Lx0/o;->N(IZ)Z

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    if-eqz p2, :cond_1

    .line 29
    .line 30
    sget-object p2, Lm0/e9;->b:Lx0/o2;

    .line 31
    .line 32
    invoke-virtual {p1, p2}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    check-cast p2, Lm0/d9;

    .line 37
    .line 38
    iget-object p2, p2, Lm0/d9;->k:Lt2/l0;

    .line 39
    .line 40
    new-instance v0, Lm0/u0;

    .line 41
    .line 42
    iget-object v1, p0, Lm0/u0;->c:Lic/o;

    .line 43
    .line 44
    const/4 v2, 0x0

    .line 45
    iget-object v3, p0, Lm0/u0;->b:Ly/d1;

    .line 46
    .line 47
    invoke-direct {v0, v3, v1, v2}, Lm0/u0;-><init>(Ly/d1;Lic/o;I)V

    .line 48
    .line 49
    .line 50
    const v1, 0x9ddf013

    .line 51
    .line 52
    .line 53
    invoke-static {v1, v0, p1}, Lf1/g;->f(ILub/e;Lx0/o;)Lf1/f;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    const/16 v1, 0x30

    .line 58
    .line 59
    invoke-static {p2, v0, p1, v1}, Lm0/z8;->a(Lt2/l0;Lic/n;Lx0/o;I)V

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_1
    invoke-virtual {p1}, Lx0/o;->Q()V

    .line 64
    .line 65
    .line 66
    :goto_1
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 67
    .line 68
    return-object p1

    .line 69
    :pswitch_0
    check-cast p1, Lx0/o;

    .line 70
    .line 71
    check-cast p2, Ljava/lang/Number;

    .line 72
    .line 73
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    and-int/lit8 v0, p2, 0x3

    .line 78
    .line 79
    const/4 v1, 0x2

    .line 80
    const/4 v2, 0x1

    .line 81
    if-eq v0, v1, :cond_2

    .line 82
    .line 83
    const/4 v0, 0x1

    .line 84
    goto :goto_2

    .line 85
    :cond_2
    const/4 v0, 0x0

    .line 86
    :goto_2
    and-int/2addr p2, v2

    .line 87
    invoke-virtual {p1, p2, v0}, Lx0/o;->N(IZ)Z

    .line 88
    .line 89
    .line 90
    move-result p2

    .line 91
    if-eqz p2, :cond_6

    .line 92
    .line 93
    sget p2, Lm0/s0;->b:F

    .line 94
    .line 95
    sget v0, Lm0/s0;->c:F

    .line 96
    .line 97
    sget-object v1, Lj1/n;->a:Lj1/n;

    .line 98
    .line 99
    invoke-static {v1, p2, v0}, Landroidx/compose/foundation/layout/c;->a(Lj1/q;FF)Lj1/q;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    iget-object v0, p0, Lm0/u0;->b:Ly/d1;

    .line 104
    .line 105
    invoke-static {p2, v0}, Landroidx/compose/foundation/layout/a;->i(Lj1/q;Ly/d1;)Lj1/q;

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    sget-object v0, Ly/k;->d:Ly/e;

    .line 110
    .line 111
    sget-object v1, Lj1/c;->k:Lj1/g;

    .line 112
    .line 113
    const/16 v3, 0x36

    .line 114
    .line 115
    invoke-static {v0, v1, p1, v3}, Ly/i1;->a(Ly/f;Lj1/g;Lx0/o;I)Ly/j1;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-static {p1}, Lx0/v;->q(Lx0/o;)I

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    invoke-virtual {p1}, Lx0/o;->l()Lx0/j1;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    invoke-static {p2, p1}, Lj1/a;->c(Lj1/q;Lx0/o;)Lj1/q;

    .line 128
    .line 129
    .line 130
    move-result-object p2

    .line 131
    sget-object v4, Li2/k;->g0:Li2/j;

    .line 132
    .line 133
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    sget-object v4, Li2/j;->b:Li2/i;

    .line 137
    .line 138
    invoke-virtual {p1}, Lx0/o;->a0()V

    .line 139
    .line 140
    .line 141
    iget-boolean v5, p1, Lx0/o;->S:Z

    .line 142
    .line 143
    if-eqz v5, :cond_3

    .line 144
    .line 145
    invoke-virtual {p1, v4}, Lx0/o;->k(Lic/a;)V

    .line 146
    .line 147
    .line 148
    goto :goto_3

    .line 149
    :cond_3
    invoke-virtual {p1}, Lx0/o;->k0()V

    .line 150
    .line 151
    .line 152
    :goto_3
    sget-object v4, Li2/j;->g:Li2/h;

    .line 153
    .line 154
    invoke-static {v4, v0, p1}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 155
    .line 156
    .line 157
    sget-object v0, Li2/j;->f:Li2/h;

    .line 158
    .line 159
    invoke-static {v0, v3, p1}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 160
    .line 161
    .line 162
    sget-object v0, Li2/j;->j:Li2/h;

    .line 163
    .line 164
    iget-boolean v3, p1, Lx0/o;->S:Z

    .line 165
    .line 166
    if-nez v3, :cond_4

    .line 167
    .line 168
    invoke-virtual {p1}, Lx0/o;->K()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 173
    .line 174
    .line 175
    move-result-object v4

    .line 176
    invoke-static {v3, v4}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result v3

    .line 180
    if-nez v3, :cond_5

    .line 181
    .line 182
    :cond_4
    invoke-static {v1, p1, v1, v0}, Lj2/h0;->s(ILx0/o;ILi2/h;)V

    .line 183
    .line 184
    .line 185
    :cond_5
    sget-object v0, Li2/j;->d:Li2/h;

    .line 186
    .line 187
    invoke-static {v0, p2, p1}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 188
    .line 189
    .line 190
    const/4 p2, 0x6

    .line 191
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 192
    .line 193
    .line 194
    move-result-object p2

    .line 195
    iget-object v0, p0, Lm0/u0;->c:Lic/o;

    .line 196
    .line 197
    sget-object v1, Ly/l1;->a:Ly/l1;

    .line 198
    .line 199
    invoke-interface {v0, v1, p1, p2}, Lic/o;->g(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    invoke-virtual {p1, v2}, Lx0/o;->p(Z)V

    .line 203
    .line 204
    .line 205
    goto :goto_4

    .line 206
    :cond_6
    invoke-virtual {p1}, Lx0/o;->Q()V

    .line 207
    .line 208
    .line 209
    :goto_4
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 210
    .line 211
    return-object p1

    .line 212
    nop

    .line 213
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 214
.end method
