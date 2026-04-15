.class public final Lcg/i;
.super Ljc/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# static fields
.field public static final b:Lcg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcg/i;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, v1}, Ljc/m;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcg/i;->b:Lcg/i;

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
.end method


# virtual methods
.method public final q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v5, p1

    .line 2
    .line 3
    check-cast v5, Lx0/o;

    .line 4
    .line 5
    move-object/from16 v0, p2

    .line 6
    .line 7
    check-cast v0, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    and-int/lit8 v0, v0, 0xb

    .line 14
    .line 15
    const/4 v1, 0x2

    .line 16
    if-ne v0, v1, :cond_1

    .line 17
    .line 18
    invoke-virtual {v5}, Lx0/o;->z()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {v5}, Lx0/o;->Q()V

    .line 26
    .line 27
    .line 28
    goto/16 :goto_2

    .line 29
    .line 30
    :cond_1
    :goto_0
    sget-object v0, Ln7/e;->a:Lw1/f;

    .line 31
    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_2
    new-instance v6, Lw1/e;

    .line 36
    .line 37
    const/4 v14, 0x0

    .line 38
    const/16 v16, 0x60

    .line 39
    .line 40
    const-string v7, "Filled.ArrowBack"

    .line 41
    .line 42
    const/high16 v8, 0x41c00000    # 24.0f

    .line 43
    .line 44
    const/high16 v9, 0x41c00000    # 24.0f

    .line 45
    .line 46
    const/high16 v10, 0x41c00000    # 24.0f

    .line 47
    .line 48
    const/high16 v11, 0x41c00000    # 24.0f

    .line 49
    .line 50
    const-wide/16 v12, 0x0

    .line 51
    .line 52
    const/4 v15, 0x0

    .line 53
    invoke-direct/range {v6 .. v16}, Lw1/e;-><init>(Ljava/lang/String;FFFFJIZI)V

    .line 54
    .line 55
    .line 56
    sget v0, Lw1/g0;->a:I

    .line 57
    .line 58
    new-instance v0, Lq1/n0;

    .line 59
    .line 60
    sget-wide v1, Lq1/q;->b:J

    .line 61
    .line 62
    invoke-direct {v0, v1, v2}, Lq1/n0;-><init>(J)V

    .line 63
    .line 64
    .line 65
    new-instance v1, Lhd/q0;

    .line 66
    .line 67
    const/4 v2, 0x6

    .line 68
    const/4 v3, 0x0

    .line 69
    invoke-direct {v1, v3, v2}, Lhd/q0;-><init>(BI)V

    .line 70
    .line 71
    .line 72
    const/high16 v2, 0x41300000    # 11.0f

    .line 73
    .line 74
    const/high16 v4, 0x41a00000    # 20.0f

    .line 75
    .line 76
    invoke-virtual {v1, v4, v2}, Lhd/q0;->u(FF)V

    .line 77
    .line 78
    .line 79
    const v2, 0x40fa8f5c    # 7.83f

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1, v2}, Lhd/q0;->q(F)V

    .line 83
    .line 84
    .line 85
    const v7, 0x40b2e148    # 5.59f

    .line 86
    .line 87
    .line 88
    const v8, -0x3f4d1eb8    # -5.59f

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1, v7, v8}, Lhd/q0;->t(FF)V

    .line 92
    .line 93
    .line 94
    const/high16 v7, 0x41400000    # 12.0f

    .line 95
    .line 96
    const/high16 v8, 0x40800000    # 4.0f

    .line 97
    .line 98
    invoke-virtual {v1, v7, v8}, Lhd/q0;->s(FF)V

    .line 99
    .line 100
    .line 101
    const/high16 v7, -0x3f000000    # -8.0f

    .line 102
    .line 103
    const/high16 v8, 0x41000000    # 8.0f

    .line 104
    .line 105
    invoke-virtual {v1, v7, v8}, Lhd/q0;->t(FF)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1, v8, v8}, Lhd/q0;->t(FF)V

    .line 109
    .line 110
    .line 111
    const v7, 0x3fb47ae1    # 1.41f

    .line 112
    .line 113
    .line 114
    const v8, -0x404b851f    # -1.41f

    .line 115
    .line 116
    .line 117
    invoke-virtual {v1, v7, v8}, Lhd/q0;->t(FF)V

    .line 118
    .line 119
    .line 120
    const/high16 v7, 0x41500000    # 13.0f

    .line 121
    .line 122
    invoke-virtual {v1, v2, v7}, Lhd/q0;->s(FF)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v1, v4}, Lhd/q0;->q(F)V

    .line 126
    .line 127
    .line 128
    const/high16 v2, -0x40000000    # -2.0f

    .line 129
    .line 130
    invoke-virtual {v1, v2}, Lhd/q0;->z(F)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v1}, Lhd/q0;->l()V

    .line 134
    .line 135
    .line 136
    iget-object v1, v1, Lhd/q0;->b:Ljava/util/ArrayList;

    .line 137
    .line 138
    invoke-static {v6, v1, v3, v0}, Lw1/e;->a(Lw1/e;Ljava/util/ArrayList;ILq1/n0;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v6}, Lw1/e;->b()Lw1/f;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    sput-object v0, Ln7/e;->a:Lw1/f;

    .line 146
    .line 147
    :goto_1
    sget-wide v3, Lq1/q;->d:J

    .line 148
    .line 149
    const/16 v6, 0xc30

    .line 150
    .line 151
    const/4 v7, 0x4

    .line 152
    const/4 v1, 0x0

    .line 153
    const/4 v2, 0x0

    .line 154
    invoke-static/range {v0 .. v7}, Lv0/j;->b(Lw1/f;Ljava/lang/String;Lj1/q;JLx0/o;II)V

    .line 155
    .line 156
    .line 157
    :goto_2
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 158
    .line 159
    return-object v0
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
