.class public final Lm0/b9;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# instance fields
.field public final synthetic a:F

.field public final synthetic b:Lic/n;


# direct methods
.method public constructor <init>(FLic/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lm0/b9;->a:F

    .line 5
    .line 6
    iput-object p2, p0, Lm0/b9;->b:Lic/n;

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
.method public final q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

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
    const/4 v1, 0x1

    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x2

    .line 14
    if-eq v0, v3, :cond_0

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
    and-int/2addr p2, v1

    .line 20
    invoke-virtual {p1, p2, v0}, Lx0/o;->N(IZ)Z

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    if-eqz p2, :cond_4

    .line 25
    .line 26
    iget p2, p0, Lm0/b9;->a:F

    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    sget-object v4, Lj1/n;->a:Lj1/n;

    .line 30
    .line 31
    invoke-static {v4, p2, v0, v3}, Landroidx/compose/foundation/layout/c;->f(Lj1/q;FFI)Lj1/q;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    sget v8, Lm0/c9;->o:F

    .line 36
    .line 37
    const/4 v9, 0x0

    .line 38
    const/16 v10, 0xb

    .line 39
    .line 40
    const/4 v6, 0x0

    .line 41
    const/4 v7, 0x0

    .line 42
    invoke-static/range {v5 .. v10}, Landroidx/compose/foundation/layout/a;->n(Lj1/q;FFFFI)Lj1/q;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    sget-object v0, Lj1/c;->e:Lj1/h;

    .line 47
    .line 48
    invoke-static {v0, v2}, Ly/p;->d(Lj1/h;Z)Lg2/v0;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-static {p1}, Lx0/v;->q(Lx0/o;)I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    invoke-virtual {p1}, Lx0/o;->l()Lx0/j1;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-static {p2, p1}, Lj1/a;->c(Lj1/q;Lx0/o;)Lj1/q;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    sget-object v5, Li2/k;->g0:Li2/j;

    .line 65
    .line 66
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    sget-object v5, Li2/j;->b:Li2/i;

    .line 70
    .line 71
    invoke-virtual {p1}, Lx0/o;->a0()V

    .line 72
    .line 73
    .line 74
    iget-boolean v6, p1, Lx0/o;->S:Z

    .line 75
    .line 76
    if-eqz v6, :cond_1

    .line 77
    .line 78
    invoke-virtual {p1, v5}, Lx0/o;->k(Lic/a;)V

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_1
    invoke-virtual {p1}, Lx0/o;->k0()V

    .line 83
    .line 84
    .line 85
    :goto_1
    sget-object v5, Li2/j;->g:Li2/h;

    .line 86
    .line 87
    invoke-static {v5, v0, p1}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 88
    .line 89
    .line 90
    sget-object v0, Li2/j;->f:Li2/h;

    .line 91
    .line 92
    invoke-static {v0, v4, p1}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 93
    .line 94
    .line 95
    sget-object v0, Li2/j;->j:Li2/h;

    .line 96
    .line 97
    iget-boolean v4, p1, Lx0/o;->S:Z

    .line 98
    .line 99
    if-nez v4, :cond_2

    .line 100
    .line 101
    invoke-virtual {p1}, Lx0/o;->K()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    invoke-static {v4, v5}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    if-nez v4, :cond_3

    .line 114
    .line 115
    :cond_2
    invoke-static {v3, p1, v3, v0}, Lj2/h0;->s(ILx0/o;ILi2/h;)V

    .line 116
    .line 117
    .line 118
    :cond_3
    sget-object v0, Li2/j;->d:Li2/h;

    .line 119
    .line 120
    invoke-static {v0, p2, p1}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 121
    .line 122
    .line 123
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 124
    .line 125
    .line 126
    move-result-object p2

    .line 127
    iget-object v0, p0, Lm0/b9;->b:Lic/n;

    .line 128
    .line 129
    invoke-interface {v0, p1, p2}, Lic/n;->q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    invoke-virtual {p1, v1}, Lx0/o;->p(Z)V

    .line 133
    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_4
    invoke-virtual {p1}, Lx0/o;->Q()V

    .line 137
    .line 138
    .line 139
    :goto_2
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 140
    .line 141
    return-object p1
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
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
