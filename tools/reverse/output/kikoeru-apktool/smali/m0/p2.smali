.class public final Lm0/p2;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lic/o;


# direct methods
.method public synthetic constructor <init>(Lic/o;I)V
    .locals 0

    .line 1
    iput p2, p0, Lm0/p2;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lm0/p2;->b:Lic/o;

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
.method public final q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lm0/p2;->a:I

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
    const/4 v2, 0x0

    .line 18
    const/4 v3, 0x1

    .line 19
    if-eq v0, v1, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    :goto_0
    and-int/2addr p2, v3

    .line 25
    invoke-virtual {p1, p2, v0}, Lx0/o;->N(IZ)Z

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    if-eqz p2, :cond_1

    .line 30
    .line 31
    sget-object p2, Ly/l1;->a:Ly/l1;

    .line 32
    .line 33
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iget-object v1, p0, Lm0/p2;->b:Lic/o;

    .line 38
    .line 39
    invoke-interface {v1, p2, p1, v0}, Lic/o;->g(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    invoke-virtual {p1}, Lx0/o;->Q()V

    .line 44
    .line 45
    .line 46
    :goto_1
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 47
    .line 48
    return-object p1

    .line 49
    :pswitch_0
    check-cast p1, Lx0/o;

    .line 50
    .line 51
    check-cast p2, Ljava/lang/Number;

    .line 52
    .line 53
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 54
    .line 55
    .line 56
    move-result p2

    .line 57
    and-int/lit8 v0, p2, 0x3

    .line 58
    .line 59
    const/4 v1, 0x2

    .line 60
    const/4 v2, 0x0

    .line 61
    const/4 v3, 0x1

    .line 62
    if-eq v0, v1, :cond_2

    .line 63
    .line 64
    const/4 v0, 0x1

    .line 65
    goto :goto_2

    .line 66
    :cond_2
    const/4 v0, 0x0

    .line 67
    :goto_2
    and-int/2addr p2, v3

    .line 68
    invoke-virtual {p1, p2, v0}, Lx0/o;->N(IZ)Z

    .line 69
    .line 70
    .line 71
    move-result p2

    .line 72
    if-eqz p2, :cond_6

    .line 73
    .line 74
    sget-object p2, Landroidx/compose/foundation/layout/c;->c:Landroidx/compose/foundation/layout/FillElement;

    .line 75
    .line 76
    sget-object v0, Ly/k;->c:Ly/o0;

    .line 77
    .line 78
    sget-object v1, Lj1/c;->m:Lj1/f;

    .line 79
    .line 80
    invoke-static {v0, v1, p1, v2}, Ly/u;->a(Ly/h;Lj1/f;Lx0/o;I)Ly/v;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-static {p1}, Lx0/v;->q(Lx0/o;)I

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    invoke-virtual {p1}, Lx0/o;->l()Lx0/j1;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    invoke-static {p2, p1}, Lj1/a;->c(Lj1/q;Lx0/o;)Lj1/q;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    sget-object v4, Li2/k;->g0:Li2/j;

    .line 97
    .line 98
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    sget-object v4, Li2/j;->b:Li2/i;

    .line 102
    .line 103
    invoke-virtual {p1}, Lx0/o;->a0()V

    .line 104
    .line 105
    .line 106
    iget-boolean v5, p1, Lx0/o;->S:Z

    .line 107
    .line 108
    if-eqz v5, :cond_3

    .line 109
    .line 110
    invoke-virtual {p1, v4}, Lx0/o;->k(Lic/a;)V

    .line 111
    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_3
    invoke-virtual {p1}, Lx0/o;->k0()V

    .line 115
    .line 116
    .line 117
    :goto_3
    sget-object v4, Li2/j;->g:Li2/h;

    .line 118
    .line 119
    invoke-static {v4, v0, p1}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 120
    .line 121
    .line 122
    sget-object v0, Li2/j;->f:Li2/h;

    .line 123
    .line 124
    invoke-static {v0, v2, p1}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 125
    .line 126
    .line 127
    sget-object v0, Li2/j;->j:Li2/h;

    .line 128
    .line 129
    iget-boolean v2, p1, Lx0/o;->S:Z

    .line 130
    .line 131
    if-nez v2, :cond_4

    .line 132
    .line 133
    invoke-virtual {p1}, Lx0/o;->K()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    invoke-static {v2, v4}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v2

    .line 145
    if-nez v2, :cond_5

    .line 146
    .line 147
    :cond_4
    invoke-static {v1, p1, v1, v0}, Lj2/h0;->s(ILx0/o;ILi2/h;)V

    .line 148
    .line 149
    .line 150
    :cond_5
    sget-object v0, Li2/j;->d:Li2/h;

    .line 151
    .line 152
    invoke-static {v0, p2, p1}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 153
    .line 154
    .line 155
    const/4 p2, 0x6

    .line 156
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 157
    .line 158
    .line 159
    move-result-object p2

    .line 160
    iget-object v0, p0, Lm0/p2;->b:Lic/o;

    .line 161
    .line 162
    sget-object v1, Ly/w;->a:Ly/w;

    .line 163
    .line 164
    invoke-interface {v0, v1, p1, p2}, Lic/o;->g(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    invoke-virtual {p1, v3}, Lx0/o;->p(Z)V

    .line 168
    .line 169
    .line 170
    goto :goto_4

    .line 171
    :cond_6
    invoke-virtual {p1}, Lx0/o;->Q()V

    .line 172
    .line 173
    .line 174
    :goto_4
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 175
    .line 176
    return-object p1

    .line 177
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
