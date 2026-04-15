.class public final La0/s;
.super Ljc/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/k;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Z

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lic/a;ZLq1/f;Lq1/k;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, La0/s;->b:I

    .line 1
    iput-object p1, p0, La0/s;->d:Ljava/lang/Object;

    iput-boolean p2, p0, La0/s;->c:Z

    iput-object p3, p0, La0/s;->e:Ljava/lang/Object;

    iput-object p4, p0, La0/s;->f:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lx0/w0;Ljava/util/ArrayList;Ljava/util/List;Z)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, La0/s;->b:I

    .line 2
    iput-object p1, p0, La0/s;->d:Ljava/lang/Object;

    iput-object p2, p0, La0/s;->e:Ljava/lang/Object;

    iput-object p3, p0, La0/s;->f:Ljava/lang/Object;

    iput-boolean p4, p0, La0/s;->c:Z

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, La0/s;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La0/s;->f:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lq1/k;

    .line 9
    .line 10
    iget-object v1, p0, La0/s;->e:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lq1/f;

    .line 13
    .line 14
    check-cast p1, Li2/l0;

    .line 15
    .line 16
    invoke-virtual {p1}, Li2/l0;->b()V

    .line 17
    .line 18
    .line 19
    iget-object p1, p1, Li2/l0;->a:Ls1/b;

    .line 20
    .line 21
    iget-object v2, p0, La0/s;->d:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v2, Lic/a;

    .line 24
    .line 25
    invoke-interface {v2}, Lic/a;->b()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, Ljava/lang/Boolean;

    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-nez v2, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    iget-boolean v2, p0, La0/s;->c:Z

    .line 39
    .line 40
    if-eqz v2, :cond_1

    .line 41
    .line 42
    invoke-virtual {p1}, Ls1/b;->c0()J

    .line 43
    .line 44
    .line 45
    move-result-wide v2

    .line 46
    iget-object v4, p1, Ls1/b;->b:Lc7/e1;

    .line 47
    .line 48
    invoke-virtual {v4}, Lc7/e1;->D()J

    .line 49
    .line 50
    .line 51
    move-result-wide v5

    .line 52
    invoke-virtual {v4}, Lc7/e1;->z()Lq1/o;

    .line 53
    .line 54
    .line 55
    move-result-object v7

    .line 56
    invoke-interface {v7}, Lq1/o;->f()V

    .line 57
    .line 58
    .line 59
    :try_start_0
    iget-object v7, v4, Lc7/e1;->b:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v7, Lr/y1;

    .line 62
    .line 63
    const/high16 v8, -0x40800000    # -1.0f

    .line 64
    .line 65
    const/high16 v9, 0x3f800000    # 1.0f

    .line 66
    .line 67
    invoke-virtual {v7, v8, v9, v2, v3}, Lr/y1;->g0(FFJ)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1, v1, v0}, Ls1/b;->f(Lq1/f;Lq1/k;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    .line 72
    .line 73
    invoke-static {v4, v5, v6}, Lq/t0;->L(Lc7/e1;J)V

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :catchall_0
    move-exception p1

    .line 78
    invoke-static {v4, v5, v6}, Lq/t0;->L(Lc7/e1;J)V

    .line 79
    .line 80
    .line 81
    throw p1

    .line 82
    :cond_1
    invoke-virtual {p1, v1, v0}, Ls1/b;->f(Lq1/f;Lq1/k;)V

    .line 83
    .line 84
    .line 85
    :goto_0
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 86
    .line 87
    return-object p1

    .line 88
    :pswitch_0
    check-cast p1, Lg2/f1;

    .line 89
    .line 90
    iget-object v0, p0, La0/s;->e:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v0, Ljava/util/ArrayList;

    .line 93
    .line 94
    const/4 v1, 0x1

    .line 95
    iput-boolean v1, p1, Lg2/f1;->a:Z

    .line 96
    .line 97
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    const/4 v2, 0x0

    .line 102
    const/4 v3, 0x0

    .line 103
    :goto_1
    iget-boolean v4, p0, La0/s;->c:Z

    .line 104
    .line 105
    if-ge v3, v1, :cond_2

    .line 106
    .line 107
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    check-cast v5, La0/u;

    .line 112
    .line 113
    invoke-virtual {v5, p1, v4}, La0/u;->a(Lg2/f1;Z)V

    .line 114
    .line 115
    .line 116
    add-int/lit8 v3, v3, 0x1

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_2
    iget-object v0, p0, La0/s;->f:Ljava/lang/Object;

    .line 120
    .line 121
    move-object v1, v0

    .line 122
    check-cast v1, Ljava/util/Collection;

    .line 123
    .line 124
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    const/4 v3, 0x0

    .line 129
    :goto_2
    if-ge v3, v1, :cond_3

    .line 130
    .line 131
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v5

    .line 135
    check-cast v5, La0/u;

    .line 136
    .line 137
    invoke-virtual {v5, p1, v4}, La0/u;->a(Lg2/f1;Z)V

    .line 138
    .line 139
    .line 140
    add-int/lit8 v3, v3, 0x1

    .line 141
    .line 142
    goto :goto_2

    .line 143
    :cond_3
    iput-boolean v2, p1, Lg2/f1;->a:Z

    .line 144
    .line 145
    iget-object p1, p0, La0/s;->d:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast p1, Lx0/w0;

    .line 148
    .line 149
    invoke-interface {p1}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 153
    .line 154
    return-object p1

    .line 155
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
