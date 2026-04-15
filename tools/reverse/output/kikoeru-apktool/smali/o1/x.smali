.class public final Lo1/x;
.super Ljc/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/k;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:I

.field public final synthetic f:Ljava/io/Serializable;

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lo1/v;Lo1/v;Ljava/lang/Object;ILcg/b;I)V
    .locals 0

    .line 1
    iput p6, p0, Lo1/x;->b:I

    iput-object p1, p0, Lo1/x;->c:Ljava/lang/Object;

    iput-object p2, p0, Lo1/x;->d:Ljava/lang/Object;

    iput-object p3, p0, Lo1/x;->g:Ljava/lang/Object;

    iput p4, p0, Lo1/x;->e:I

    iput-object p5, p0, Lo1/x;->f:Ljava/io/Serializable;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    return-void
.end method

.method public constructor <init>([Lg2/g1;Ly/v;ILg2/x0;[I)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lo1/x;->b:I

    .line 2
    iput-object p1, p0, Lo1/x;->c:Ljava/lang/Object;

    iput-object p2, p0, Lo1/x;->d:Ljava/lang/Object;

    iput p3, p0, Lo1/x;->e:I

    iput-object p4, p0, Lo1/x;->g:Ljava/lang/Object;

    iput-object p5, p0, Lo1/x;->f:Ljava/io/Serializable;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget v0, p0, Lo1/x;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lg2/f1;

    .line 7
    .line 8
    iget-object v0, p0, Lo1/x;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, [Lg2/g1;

    .line 11
    .line 12
    iget-object v1, p0, Lo1/x;->d:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Ly/v;

    .line 15
    .line 16
    iget-object v2, p0, Lo1/x;->g:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v2, Lg2/x0;

    .line 19
    .line 20
    iget-object v3, p0, Lo1/x;->f:Ljava/io/Serializable;

    .line 21
    .line 22
    check-cast v3, [I

    .line 23
    .line 24
    array-length v4, v0

    .line 25
    const/4 v5, 0x0

    .line 26
    const/4 v6, 0x0

    .line 27
    const/4 v7, 0x0

    .line 28
    :goto_0
    if-ge v6, v4, :cond_3

    .line 29
    .line 30
    aget-object v8, v0, v6

    .line 31
    .line 32
    add-int/lit8 v9, v7, 0x1

    .line 33
    .line 34
    invoke-static {v8}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v8}, Lg2/g1;->A()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v10

    .line 41
    instance-of v11, v10, Ly/h1;

    .line 42
    .line 43
    const/4 v12, 0x0

    .line 44
    if-eqz v11, :cond_0

    .line 45
    .line 46
    check-cast v10, Ly/h1;

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_0
    move-object v10, v12

    .line 50
    :goto_1
    invoke-interface {v2}, Lg2/y;->getLayoutDirection()Lf3/m;

    .line 51
    .line 52
    .line 53
    move-result-object v11

    .line 54
    if-eqz v10, :cond_1

    .line 55
    .line 56
    iget-object v12, v10, Ly/h1;->c:Ly/d;

    .line 57
    .line 58
    :cond_1
    iget v10, p0, Lo1/x;->e:I

    .line 59
    .line 60
    if-eqz v12, :cond_2

    .line 61
    .line 62
    iget v13, v8, Lg2/g1;->a:I

    .line 63
    .line 64
    sub-int/2addr v10, v13

    .line 65
    invoke-virtual {v12, v10, v11}, Ly/d;->f(ILf3/m;)I

    .line 66
    .line 67
    .line 68
    move-result v10

    .line 69
    goto :goto_2

    .line 70
    :cond_2
    iget-object v12, v1, Ly/v;->b:Lj1/f;

    .line 71
    .line 72
    iget v13, v8, Lg2/g1;->a:I

    .line 73
    .line 74
    sub-int/2addr v10, v13

    .line 75
    invoke-virtual {v12, v5, v10, v11}, Lj1/f;->a(IILf3/m;)I

    .line 76
    .line 77
    .line 78
    move-result v10

    .line 79
    :goto_2
    aget v7, v3, v7

    .line 80
    .line 81
    invoke-static {p1, v8, v10, v7}, Lg2/f1;->i(Lg2/f1;Lg2/g1;II)V

    .line 82
    .line 83
    .line 84
    add-int/lit8 v6, v6, 0x1

    .line 85
    .line 86
    move v7, v9

    .line 87
    goto :goto_0

    .line 88
    :cond_3
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 89
    .line 90
    return-object p1

    .line 91
    :pswitch_0
    check-cast p1, Lg2/j;

    .line 92
    .line 93
    iget-object v0, p0, Lo1/x;->c:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v0, Lo1/v;

    .line 96
    .line 97
    iget-object v1, p0, Lo1/x;->d:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v1, Lo1/v;

    .line 100
    .line 101
    invoke-static {v1}, Li2/f;->z(Li2/m;)Li2/p1;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    check-cast v2, Lj2/v;

    .line 106
    .line 107
    invoke-virtual {v2}, Lj2/v;->getFocusOwner()Lo1/i;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    check-cast v2, Lo1/k;

    .line 112
    .line 113
    iget-object v2, v2, Lo1/k;->h:Lo1/v;

    .line 114
    .line 115
    if-eq v0, v2, :cond_4

    .line 116
    .line 117
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 118
    .line 119
    goto :goto_4

    .line 120
    :cond_4
    iget-object v0, p0, Lo1/x;->g:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v0, Lp1/c;

    .line 123
    .line 124
    iget-object v2, p0, Lo1/x;->f:Ljava/io/Serializable;

    .line 125
    .line 126
    check-cast v2, Lcg/b;

    .line 127
    .line 128
    iget v3, p0, Lo1/x;->e:I

    .line 129
    .line 130
    invoke-static {v3, v2, v1, v0}, Lo1/f;->A(ILcg/b;Lo1/v;Lp1/c;)Z

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    if-nez v0, :cond_6

    .line 139
    .line 140
    invoke-interface {p1}, Lg2/j;->a()Z

    .line 141
    .line 142
    .line 143
    move-result p1

    .line 144
    if-nez p1, :cond_5

    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_5
    const/4 p1, 0x0

    .line 148
    goto :goto_4

    .line 149
    :cond_6
    :goto_3
    move-object p1, v1

    .line 150
    :goto_4
    return-object p1

    .line 151
    :pswitch_1
    check-cast p1, Lg2/j;

    .line 152
    .line 153
    iget-object v0, p0, Lo1/x;->c:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v0, Lo1/v;

    .line 156
    .line 157
    iget-object v1, p0, Lo1/x;->d:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v1, Lo1/v;

    .line 160
    .line 161
    invoke-static {v1}, Li2/f;->z(Li2/m;)Li2/p1;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    check-cast v2, Lj2/v;

    .line 166
    .line 167
    invoke-virtual {v2}, Lj2/v;->getFocusOwner()Lo1/i;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    check-cast v2, Lo1/k;

    .line 172
    .line 173
    iget-object v2, v2, Lo1/k;->h:Lo1/v;

    .line 174
    .line 175
    if-eq v0, v2, :cond_7

    .line 176
    .line 177
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 178
    .line 179
    goto :goto_6

    .line 180
    :cond_7
    iget-object v0, p0, Lo1/x;->g:Ljava/lang/Object;

    .line 181
    .line 182
    check-cast v0, Lo1/v;

    .line 183
    .line 184
    iget-object v2, p0, Lo1/x;->f:Ljava/io/Serializable;

    .line 185
    .line 186
    check-cast v2, Lcg/b;

    .line 187
    .line 188
    iget v3, p0, Lo1/x;->e:I

    .line 189
    .line 190
    invoke-static {v1, v0, v3, v2}, Lo1/f;->B(Lo1/v;Lo1/v;ILcg/b;)Z

    .line 191
    .line 192
    .line 193
    move-result v0

    .line 194
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    if-nez v0, :cond_9

    .line 199
    .line 200
    invoke-interface {p1}, Lg2/j;->a()Z

    .line 201
    .line 202
    .line 203
    move-result p1

    .line 204
    if-nez p1, :cond_8

    .line 205
    .line 206
    goto :goto_5

    .line 207
    :cond_8
    const/4 p1, 0x0

    .line 208
    goto :goto_6

    .line 209
    :cond_9
    :goto_5
    move-object p1, v1

    .line 210
    :goto_6
    return-object p1

    .line 211
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
.end method
