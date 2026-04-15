.class public final Lh0/a;
.super Ljc/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# instance fields
.field public final synthetic b:J

.field public final synthetic c:Lj1/q;


# direct methods
.method public constructor <init>(JLj1/q;)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lh0/a;->b:J

    .line 2
    .line 3
    iput-object p3, p0, Lh0/a;->c:Lj1/q;

    .line 4
    .line 5
    const/4 p1, 0x2

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
.method public final q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    check-cast p1, Lx0/o;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Number;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    and-int/lit8 v0, p2, 0x3

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    const/4 v2, 0x1

    .line 13
    const/4 v3, 0x0

    .line 14
    if-eq v0, v1, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    :goto_0
    and-int/2addr p2, v2

    .line 20
    invoke-virtual {p1, p2, v0}, Lx0/o;->N(IZ)Z

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    if-eqz p2, :cond_5

    .line 25
    .line 26
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    iget-wide v4, p0, Lh0/a;->b:J

    .line 32
    .line 33
    cmp-long p2, v4, v0

    .line 34
    .line 35
    if-eqz p2, :cond_4

    .line 36
    .line 37
    const p2, 0x6d034808

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, p2}, Lx0/o;->W(I)V

    .line 41
    .line 42
    .line 43
    invoke-static {v4, v5}, Lf3/h;->b(J)F

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    invoke-static {v4, v5}, Lf3/h;->a(J)F

    .line 48
    .line 49
    .line 50
    move-result v8

    .line 51
    const/4 v10, 0x0

    .line 52
    const/16 v11, 0xc

    .line 53
    .line 54
    iget-object v6, p0, Lh0/a;->c:Lj1/q;

    .line 55
    .line 56
    const/4 v9, 0x0

    .line 57
    invoke-static/range {v6 .. v11}, Landroidx/compose/foundation/layout/c;->i(Lj1/q;FFFFI)Lj1/q;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    sget-object v0, Lj1/c;->b:Lj1/h;

    .line 62
    .line 63
    invoke-static {v0, v3}, Ly/p;->d(Lj1/h;Z)Lg2/v0;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-static {p1}, Lx0/v;->q(Lx0/o;)I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    invoke-virtual {p1}, Lx0/o;->l()Lx0/j1;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    invoke-static {p2, p1}, Lj1/a;->c(Lj1/q;Lx0/o;)Lj1/q;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    sget-object v5, Li2/k;->g0:Li2/j;

    .line 80
    .line 81
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    sget-object v5, Li2/j;->b:Li2/i;

    .line 85
    .line 86
    invoke-virtual {p1}, Lx0/o;->a0()V

    .line 87
    .line 88
    .line 89
    iget-boolean v6, p1, Lx0/o;->S:Z

    .line 90
    .line 91
    if-eqz v6, :cond_1

    .line 92
    .line 93
    invoke-virtual {p1, v5}, Lx0/o;->k(Lic/a;)V

    .line 94
    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_1
    invoke-virtual {p1}, Lx0/o;->k0()V

    .line 98
    .line 99
    .line 100
    :goto_1
    sget-object v5, Li2/j;->g:Li2/h;

    .line 101
    .line 102
    invoke-static {v5, v0, p1}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 103
    .line 104
    .line 105
    sget-object v0, Li2/j;->f:Li2/h;

    .line 106
    .line 107
    invoke-static {v0, v4, p1}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 108
    .line 109
    .line 110
    sget-object v0, Li2/j;->j:Li2/h;

    .line 111
    .line 112
    iget-boolean v4, p1, Lx0/o;->S:Z

    .line 113
    .line 114
    if-nez v4, :cond_2

    .line 115
    .line 116
    invoke-virtual {p1}, Lx0/o;->K()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    invoke-static {v4, v5}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    if-nez v4, :cond_3

    .line 129
    .line 130
    :cond_2
    invoke-static {v1, p1, v1, v0}, Lj2/h0;->s(ILx0/o;ILi2/h;)V

    .line 131
    .line 132
    .line 133
    :cond_3
    sget-object v0, Li2/j;->d:Li2/h;

    .line 134
    .line 135
    invoke-static {v0, p2, p1}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 136
    .line 137
    .line 138
    const/4 p2, 0x0

    .line 139
    invoke-static {p2, p1, v3, v2}, Lh0/e;->b(Lj1/q;Lx0/o;II)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p1, v2}, Lx0/o;->p(Z)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p1, v3}, Lx0/o;->p(Z)V

    .line 146
    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_4
    const p2, 0x6d08e244

    .line 150
    .line 151
    .line 152
    invoke-virtual {p1, p2}, Lx0/o;->W(I)V

    .line 153
    .line 154
    .line 155
    iget-object p2, p0, Lh0/a;->c:Lj1/q;

    .line 156
    .line 157
    invoke-static {p2, p1, v3, v3}, Lh0/e;->b(Lj1/q;Lx0/o;II)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {p1, v3}, Lx0/o;->p(Z)V

    .line 161
    .line 162
    .line 163
    goto :goto_2

    .line 164
    :cond_5
    invoke-virtual {p1}, Lx0/o;->Q()V

    .line 165
    .line 166
    .line 167
    :goto_2
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 168
    .line 169
    return-object p1
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method
