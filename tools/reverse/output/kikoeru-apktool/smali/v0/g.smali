.class public final Lv0/g;
.super Ljc/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lj1/q;

.field public final synthetic d:Z

.field public final synthetic e:I

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcg/f0;Lj1/q;ZLv0/f;Lw/k;I)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lv0/g;->b:I

    sget-object v0, Lcg/j;->a:Lf1/f;

    .line 1
    iput-object p1, p0, Lv0/g;->f:Ljava/lang/Object;

    iput-object p2, p0, Lv0/g;->c:Lj1/q;

    iput-boolean p3, p0, Lv0/g;->d:Z

    iput-object p4, p0, Lv0/g;->g:Ljava/lang/Object;

    iput-object p5, p0, Lv0/g;->h:Ljava/lang/Object;

    iput p6, p0, Lv0/g;->e:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lv0/e0;Lv0/l0;Lj1/q;Lv0/a0;ZI)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lv0/g;->b:I

    .line 2
    iput-object p1, p0, Lv0/g;->f:Ljava/lang/Object;

    iput-object p2, p0, Lv0/g;->g:Ljava/lang/Object;

    iput-object p3, p0, Lv0/g;->c:Lj1/q;

    iput-object p4, p0, Lv0/g;->h:Ljava/lang/Object;

    iput-boolean p5, p0, Lv0/g;->d:Z

    iput p6, p0, Lv0/g;->e:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lv0/g;->b:I

    .line 4
    .line 5
    sget-object v2, Lub/a0;->a:Lub/a0;

    .line 6
    .line 7
    iget v3, v0, Lv0/g;->e:I

    .line 8
    .line 9
    iget-object v4, v0, Lv0/g;->h:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v5, v0, Lv0/g;->g:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v6, v0, Lv0/g;->f:Ljava/lang/Object;

    .line 14
    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    move-object/from16 v12, p1

    .line 19
    .line 20
    check-cast v12, Lx0/o;

    .line 21
    .line 22
    move-object/from16 v1, p2

    .line 23
    .line 24
    check-cast v1, Ljava/lang/Number;

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 27
    .line 28
    .line 29
    move-object v7, v6

    .line 30
    check-cast v7, Lv0/e0;

    .line 31
    .line 32
    move-object v8, v5

    .line 33
    check-cast v8, Lv0/l0;

    .line 34
    .line 35
    move-object v10, v4

    .line 36
    check-cast v10, Lv0/a0;

    .line 37
    .line 38
    or-int/lit8 v1, v3, 0x1

    .line 39
    .line 40
    invoke-static {v1}, Lx0/v;->D(I)I

    .line 41
    .line 42
    .line 43
    move-result v13

    .line 44
    iget-object v9, v0, Lv0/g;->c:Lj1/q;

    .line 45
    .line 46
    iget-boolean v11, v0, Lv0/g;->d:Z

    .line 47
    .line 48
    invoke-virtual/range {v7 .. v13}, Lv0/e0;->b(Lv0/l0;Lj1/q;Lv0/a0;ZLx0/o;I)V

    .line 49
    .line 50
    .line 51
    return-object v2

    .line 52
    :pswitch_0
    move-object/from16 v19, p1

    .line 53
    .line 54
    check-cast v19, Lx0/o;

    .line 55
    .line 56
    move-object/from16 v1, p2

    .line 57
    .line 58
    check-cast v1, Ljava/lang/Number;

    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 61
    .line 62
    .line 63
    move-object v14, v6

    .line 64
    check-cast v14, Lcg/f0;

    .line 65
    .line 66
    move-object/from16 v17, v5

    .line 67
    .line 68
    check-cast v17, Lv0/f;

    .line 69
    .line 70
    move-object/from16 v18, v4

    .line 71
    .line 72
    check-cast v18, Lw/k;

    .line 73
    .line 74
    sget-object v1, Lcg/j;->a:Lf1/f;

    .line 75
    .line 76
    or-int/lit8 v1, v3, 0x1

    .line 77
    .line 78
    invoke-static {v1}, Lx0/v;->D(I)I

    .line 79
    .line 80
    .line 81
    move-result v20

    .line 82
    iget-object v15, v0, Lv0/g;->c:Lj1/q;

    .line 83
    .line 84
    iget-boolean v1, v0, Lv0/g;->d:Z

    .line 85
    .line 86
    move/from16 v16, v1

    .line 87
    .line 88
    invoke-static/range {v14 .. v20}, Lvb/w;->a(Lcg/f0;Lj1/q;ZLv0/f;Lw/k;Lx0/o;I)V

    .line 89
    .line 90
    .line 91
    return-object v2

    .line 92
    nop

    .line 93
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
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
